package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;


public class UploadInternship extends AppCompatActivity {
    private String name;
    private Date applicationDeadline;
    private Date startDate;
    private Date endDate;
    private Company company;
    private String cost;
    private ArrayList<Information> additionalInfo;
    private String additionalInfoStr;

    /**
     *  A method which initializes the upload internship form with drop down menus and the given layout
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_internship);
        Spinner ageSpinner = findViewById(R.id.ageList);
        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        Spinner genderSpinner = findViewById(R.id.genderList);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.gender));
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        Spinner raceSpinner = findViewById(R.id.raceList);
        ArrayAdapter<String> raceAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.races));
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        raceSpinner.setAdapter(raceAdapter);

        Spinner fieldSpinner = findViewById(R.id.fieldList);
        ArrayAdapter<String> fieldAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.fields));
        fieldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fieldSpinner.setAdapter(fieldAdapter);

        Spinner incomeSpinner = findViewById(R.id.incomeList);
        ArrayAdapter<String> incomeAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.incomes));
        incomeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        incomeSpinner.setAdapter(incomeAdapter);

        //Save important dates
        //Save the application deadline
        CalendarView deadlineField = findViewById(R.id.applicationDeadlineCalendar);
        deadlineField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                applicationDeadline = new Date(year-1900, month, dayOfMonth);
            }
        });
        //Save the start date
        CalendarView startDateField = findViewById(R.id.internshipStartDateCalendar);
        startDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                startDate = new Date(year-1900, month, dayOfMonth);
            }
        });
        //Save the end date
        CalendarView endDateField = findViewById(R.id.internshipEndCalendar);
        endDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                endDate = new Date(year-1900, month, dayOfMonth);
            }
        });
    }

    /**
     * Saves information input on the Upload Internship screen in a new internship object
     * and saves that internship object in our firebase database
     * @param v The Upload Internship screen
     */
    public void postInternship(View v) {

        // Save the name of the internship
        EditText nameField = findViewById(R.id.inputName);
        name = nameField.getText().toString();

       //Save the company hosting the internship
        company = new Company();
        EditText linkField = findViewById(R.id.linkToApplicationText);
        company.setLink(linkField.getText().toString());

        //Save the cost of the internship
                EditText costField = findViewById(R.id.costText);
                cost = costField.getText().toString();

/**
        //Save additional information about the internship helpful for searching

        Spinner ageSpinner = findViewById(R.id.ageList);
        String targetAge = ageSpinner.getSelectedItem().toString();
        additionalInfo.add(new Information("Target Age", targetAge));

        Spinner genderSpinner = findViewById(R.id.genderList);
        String targetGender = genderSpinner.getSelectedItem().toString();
        additionalInfo.add(new Information("Target Gender", targetGender));

        Spinner raceSpinner = findViewById(R.id.raceList);
        String targetRace = raceSpinner.getSelectedItem().toString();
        additionalInfo.add(new Information("Target Race", targetRace));

        Switch militarySwitch = findViewById(R.id.militarySwitch);
        Boolean militaryExperience = militarySwitch.isChecked();
        if(militaryExperience)
            additionalInfo.add(new Information("Military Experience", "true"));
        else
            additionalInfo.add(new Information("Military Experience", "false"));

        Spinner fieldSpinner = findViewById(R.id.fieldList);
        String internshipField = fieldSpinner.getSelectedItem().toString();
        additionalInfo.add(new Information("Field", internshipField));

        EditText locationField = findViewById(R.id.locationText);
        String internshipLocation = locationField.getText().toString();
        additionalInfo.add(new Information("Location", internshipLocation));

        Spinner incomeSpinner = findViewById(R.id.incomeList);
        String targetIncome = incomeSpinner.getSelectedItem().toString();
        additionalInfo.add(new Information("Target Income", targetIncome));


        additionalInfoStr = additionalInfo.get(0).toString();
        for(int i = 1; i < additionalInfo.size(); i++)
            additionalInfoStr.concat(additionalInfo.get(i).toString());*/

        additionalInfoStr = "add";


        Internship i = new Internship(name, applicationDeadline, startDate, endDate,
                company, cost, additionalInfoStr );

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(i.getName());
        myRef.setValue(i);

    }
}
