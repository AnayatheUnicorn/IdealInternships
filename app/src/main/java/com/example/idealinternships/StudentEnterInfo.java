package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import java.util.Date;

public class StudentEnterInfo extends AppCompatActivity {

    private Date startDate;
    private Date endDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_enter_info);

        Spinner ageSpinner = findViewById(R.id.ageDropdown);
        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(StudentEnterInfo.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        Spinner genderSpinner = findViewById(R.id.genderDropdown);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(StudentEnterInfo.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.gender));
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        Spinner raceSpinner = findViewById(R.id.raceDropdown);
        ArrayAdapter<String> raceAdapter = new ArrayAdapter<String>(StudentEnterInfo.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.races));
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        raceSpinner.setAdapter(raceAdapter);

        Spinner fieldSpinner = findViewById(R.id.fieldDropdown);
        ArrayAdapter<String> fieldAdapter = new ArrayAdapter<String>(StudentEnterInfo.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.fields));
        fieldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fieldSpinner.setAdapter(fieldAdapter);

        Spinner incomeSpinner = findViewById(R.id.incomeDropdown);
        ArrayAdapter<String> incomeAdapter = new ArrayAdapter<String>(StudentEnterInfo.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.incomes));
        incomeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        incomeSpinner.setAdapter(incomeAdapter);
    }

    public void saveStudentInfo(){
        EditText firstNameField = findViewById(R.id.enterfirstName);
        String stuFirst = firstNameField.getText().toString();

        EditText lastNameField = findViewById(R.id.enterLastName);
        String stuLast = lastNameField.getText().toString();

        EditText bioField = findViewById(R.id.enterBio);
        String stuBio = bioField.getText().toString();

        Spinner ageSpinner = findViewById(R.id.ageDropdown);
        String stuAge = ageSpinner.getSelectedItem().toString();

        Spinner genderSpinner = findViewById(R.id.genderDropdown);
        String stuGender = genderSpinner.getSelectedItem().toString();

        Spinner raceSpinner = findViewById(R.id.raceDropdown);
        String stuRace = raceSpinner.getSelectedItem().toString();

        EditText schoolField = findViewById(R.id.enterSchool);
        String stuSchool = schoolField.getText().toString();

        Switch militarySwitch = findViewById(R.id.militarySwitch);
        Boolean stuMilitary = militarySwitch.isChecked();

        Spinner fieldSpinner = findViewById(R.id.fieldDropdown);
        String stuField = fieldSpinner.getSelectedItem().toString();

        EditText locationField = findViewById(R.id.enterLocation);
        String stuLocation = locationField.getText().toString();

        Spinner incomeSpinner = findViewById(R.id.incomeDropdown);
        String stuIncome = incomeSpinner.getSelectedItem().toString();

        CalendarView startDateField = findViewById(R.id.beginDateCalendar);
        startDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                startDate = new Date(year, month, dayOfMonth);
                Log.d("start date:", "year: " + year + " month: " + month + " day: " + dayOfMonth);
            }
        });

        CalendarView endDateField = findViewById(R.id.endDateCalendar);
        endDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                endDate = new Date(year, month, dayOfMonth);
            }
        });

        Switch notificationSwitch = findViewById(R.id.notificationsSwitch);
        Boolean stuNotifications = notificationSwitch.isChecked();

        Student s = new Student(stuFirst, stuLast, stuBio, stuAge, stuGender, stuRace, stuSchool, stuMilitary,
                stuField, stuLocation, stuIncome, startDate, endDate, stuNotifications);
    }
}
