package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class UploadInternshipFragment extends Fragment implements View.OnClickListener {
    private Date applicationDeadline;
    private Date startDate;
    private Date endDate;
    private CheckBox[] racesArray;
    private CheckBox[] fieldsArray;
    private View v;

    final String TAG = "UploadInternshipFrag";

    /**
     * Opens the upload internship page from the bottom navigation and saves internship information to firebase
     *
     * @param inflater           inflater
     * @param container          part of the screen above the navigation bar
     * @param savedInstanceState the app's state
     * @return the screen
     */


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_upload_internship, container, false); // Mrs. T:  Set the View to the private instance class data
        Log.d(TAG, "onCreateViewInitial");
        Spinner minAgeSpinner = v.findViewById(R.id.minAgeList);
        ArrayAdapter<String> minAgeAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        minAgeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minAgeSpinner.setAdapter(minAgeAdapter);

        Spinner maxAgeSpinner = v.findViewById(R.id.maxAgeList);
        ArrayAdapter<String> maxAgeAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        maxAgeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maxAgeSpinner.setAdapter(maxAgeAdapter);

        Spinner minGradeSpinner = v.findViewById(R.id.minAgeList);
        ArrayAdapter<String> minGradeAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        minGradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minGradeSpinner.setAdapter(minGradeAdapter);

        Spinner maxGradeSpinner = v.findViewById(R.id.maxAgeList);
        ArrayAdapter<String> maxGradeAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        maxGradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maxGradeSpinner.setAdapter(maxGradeAdapter);

        Spinner genderSpinner = v.findViewById(R.id.genderList);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.gender));
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        Spinner incomeSpinner = v.findViewById(R.id.incomeList);
        ArrayAdapter<String> incomeAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.incomes));
        incomeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        incomeSpinner.setAdapter(incomeAdapter);
        //Save important dates
        //Save the application deadline
        CalendarView deadlineField = v.findViewById(R.id.applicationDeadlineCalendar);
        deadlineField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                applicationDeadline = new Date(year - 1900, month, dayOfMonth);
            }
        });
        //Save the start date
        CalendarView startDateField = v.findViewById(R.id.internshipStartDateCalendar);
        startDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                startDate = new Date(year - 1900, month, dayOfMonth);
            }
        });
        //Save the end date
        CalendarView endDateField = v.findViewById(R.id.internshipEndCalendar);
        endDateField.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                endDate = new Date(year - 1900, month, dayOfMonth);
            }
        });

        Button postB = v.findViewById(R.id.postButton);
        // Mrs. T:  Since the class implements OnClickListener, onClick() will be invoked on button press (method is implemented below)
        postB.setOnClickListener(this);
        return v;
    }   //end onCreateView here to keep the button stuff out

    @Override
    public void onClick(View view) {
        Log.d(TAG, "In id.postButton onClick() method");

        //Save the company hosting the internship
        EditText companyNameField = v.findViewById(R.id.companyNameText);
        Company company = new Company(companyNameField.getText().toString());
        Log.d(TAG, "Company Name Entered: " + companyNameField.getText().toString());

        // Save the name of the internship
        EditText nameField = v.findViewById(R.id.inputName);
        String name = nameField.getText().toString();
        Log.d(TAG, "Name Entered: " + name);

        //Save the cost of the internship
        EditText costField = v.findViewById(R.id.costText);
        String cost = costField.getText().toString();
        Log.d(TAG, "Cost Entered: " + cost);

        //Save the minimum age
        Spinner minAgeSpinner = v.findViewById(R.id.minAgeList);
        String minAge = minAgeSpinner.getSelectedItem().toString();
        Log.d(TAG, "Min Age Entered: " + minAge);

        //Save the maximum age
        Spinner maxAgeSpinner = v.findViewById(R.id.maxAgeList);
        String maxAge = maxAgeSpinner.getSelectedItem().toString();
        Log.d(TAG, "Max Age Entered: " + minAge);

        //Save the minimum age
        Spinner minGradeSpinner = v.findViewById(R.id.minGradeList);
        String minGrade= minGradeSpinner.getSelectedItem().toString();
        Log.d(TAG, "Min Grade Entered: " + minGrade);

        //Save the maximum age
        Spinner maxGradeSpinner = v.findViewById(R.id.maxGradeList);
        String maxGrade = maxGradeSpinner.getSelectedItem().toString();
        Log.d(TAG, "Max Grade Entered: " + maxGrade);

        //Save the target gender
        Spinner genderSpinner = v.findViewById(R.id.genderList);
        String targetGender = genderSpinner.getSelectedItem().toString();
        Log.d(TAG, "Target Gender Entered: " + targetGender);

        //Save the target race(s)
        String targetRaces = " ";
        CheckBox white = v.findViewById(R.id.whiteCaucasianCheckBox);
        CheckBox black = v.findViewById(R.id.blackAfricanAmericanCheckBox);
        CheckBox nativeA = v.findViewById(R.id.nativeAmericanOrAlaskaNativeCheckBox);
        CheckBox asian = v.findViewById(R.id.asianPacificIslanderCheckBox);
        CheckBox lat = v.findViewById(R.id.latinoaCheckBox);
        CheckBox multi = v.findViewById(R.id.multiracialCheckBox);
        CheckBox notA = v.findViewById(R.id.allRacesCheckBox);


        racesArray = new CheckBox[]{white, black, nativeA, asian, lat, multi, notA};
        for (CheckBox check: racesArray){
            if(check.isChecked())
            targetRaces += check.getText() + ", ";
        }
        targetRaces = targetRaces.substring(0,targetRaces.lastIndexOf(','));

        //Save military experience
        Switch militarySwitch = v.findViewById(R.id.militarySwitch);
        Boolean militaryExperience = militarySwitch.isChecked();
        Log.d(TAG, "Military Checked Entered: " + militaryExperience);

        //Save paid
        Switch paidSwitch =v. findViewById(R.id.paidSwitch);
        Boolean paid = paidSwitch.isChecked();
        Log.d(TAG, "Paid Switch Entered: " + paid);

        //Save the field(s)
        String fields = " ";
        CheckBox bio = v.findViewById(R.id.biologyCheckBox);
        CheckBox chem = v.findViewById(R.id.chemistryCheckBox);
        CheckBox engin = v.findViewById(R.id.engineeringCheckBox);
        CheckBox phys = v.findViewById(R.id.physicsCheckBox);
        CheckBox compSci = v.findViewById(R.id.computerScienceCheckBox);
        CheckBox music = v.findViewById(R.id.musicCheckBox);
        CheckBox art = v.findViewById(R.id.artCheckBox);
        CheckBox theatre = v.findViewById(R.id.theatreCheckBox);
        CheckBox enviro = v.findViewById(R.id.environmentalScienceCheckBox);
        CheckBox neuro = v.findViewById(R.id.neuroscienceCheckBox);
        CheckBox med = v.findViewById(R.id.medicineCheckBox);
        CheckBox writ = v.findViewById(R.id.writingCheckBox);
        CheckBox business = v.findViewById(R.id.businessCheckBox);
        CheckBox gov = v.findViewById(R.id.governmentPoliticsCheckBox);
        CheckBox marketing = v.findViewById(R.id.marketingCheckBox);
        CheckBox math = v.findViewById(R.id.mathCheckBox);
        CheckBox research = v.findViewById(R.id.researchCheckBox);
        CheckBox science = v.findViewById(R.id.scienceCheckBox);
        CheckBox history = v.findViewById(R.id.historyCheckBox);
        CheckBox communications = v.findViewById(R.id.communicationsCheckBox);
        CheckBox other = v.findViewById(R.id.otherFieldCheckBox);


        fieldsArray = new CheckBox[]{bio, chem, engin, phys, compSci, music, art, theatre, enviro, neuro,
            med, writ, business, gov, marketing, math, research, science, history, communications, other};
        for (CheckBox check: fieldsArray){
            if(check.isChecked())
            fields += check.getText() + ", ";
        }
        fields = fields.substring(0,fields.lastIndexOf(','));

        //Save the location
        EditText locationField = v.findViewById(R.id.locationText);
        String location = locationField.getText().toString();
        Log.d(TAG, "Location Entered: " + location);

        //Save target income
        Spinner incomeSpinner = v.findViewById(R.id.incomeList);
        String targetIncome = incomeSpinner.getSelectedItem().toString();
        Log.d(TAG, "Target Income Entered: " + targetIncome);

        //Save preReqs
        EditText preReqsField = v.findViewById(R.id.prerequisitesText);
        String preReqs = preReqsField.getText().toString();
        Log.d(TAG, "Prereqs Entered: " + preReqs);

        //Save application link
        EditText appLinkField = v.findViewById(R.id.linkToApplicationText);
        String appLink = appLinkField.getText().toString();
        Log.d(TAG, "Application Link Entered: " + appLink);

        //Save description
        EditText descriptionField = v.findViewById(R.id.descriptionText);
        String description = descriptionField.getText().toString();
        Log.d(TAG, "Description Entered: " + description);

        Log.d(TAG, "Constructing a new Internship");
        Internship i = new Internship(name, applicationDeadline, startDate, endDate, company, cost,
            minAge, maxAge, minGrade, maxGrade, targetGender, targetRaces,
            militaryExperience, paid, fields, location, targetIncome,
            preReqs, appLink, description);

        Log.d(TAG, "Saving Internship to Firebase ...");
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Internships");
        DatabaseReference iRef = myRef.child(i.getName());
        iRef.setValue(i);
        Log.d(TAG, "Done saving Internship to Firebase");
    }  // end onClick() method
}

