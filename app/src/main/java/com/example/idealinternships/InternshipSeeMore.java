package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InternshipSeeMore extends AppCompatActivity {

    /**
     * Opens the entire internship from a card view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship_see_more);

        TextView iName = findViewById(R.id.internshipNameTextView);
        iName.setText(getIntent().getStringExtra("internship name"));

        TextView iCompany = findViewById(R.id.internshipCompanyTextView);
        iCompany.setText("Company: " + getIntent().getStringExtra("internship company"));

        TextView iField = findViewById(R.id.fieldnfoTextView);
        iField.setText("Field: " + getIntent().getStringExtra("internship fields"));

        TextView iAge = findViewById(R.id.ageInfoTextView);
        iAge.setText("Minimum Age Accepted: " + getIntent().getStringExtra("internship min age")
                + "\n" + "Maximum Age Accepted: " + getIntent().getStringExtra("internship max age"));

        TextView iGrade = findViewById(R.id.gradeInfoTextView);
        iGrade.setText("Minimum Grade Accepted: " + getIntent().getStringExtra("internship min grade")
                +"\n" + "Maximum Grade Accepted: " + getIntent().getStringExtra("internship max grade"));

        TextView iGender = findViewById(R.id.genderInfoTextView);
        iGender.setText("Genders Accepted: " + getIntent().getStringExtra("internship genders"));

        TextView iRace = findViewById(R.id.raceInfoTextView);
        iRace.setText("Races Accepted: " + getIntent().getStringExtra("internship races"));

        TextView iMilitary = findViewById(R.id.militaryInfoTextView);
        if (getIntent().getBooleanExtra("internship military", false)) {
            iMilitary.setText("Military Association Info: Internship for those with Military Association");
        }
        else{
            iMilitary.setText("Military Association Info: Not applicable for internship");
        }

        TextView iIncome = findViewById(R.id.incomeInfoTextView);
        iIncome.setText("Income brackets accepted: " + getIntent().getStringExtra("internship income"));

        TextView iLocation = findViewById(R.id.locationInfoTextView);
        iLocation.setText("Location: " + getIntent().getStringExtra("internship location"));

        TextView iCost = findViewById(R.id.costInfoTextView);
        iCost.setText("Cost: " + getIntent().getStringExtra("internship cost"));

        TextView iPaid = findViewById(R.id.paidInfoTextView);
        if(getIntent().getBooleanExtra("internship paid", false)) {
            iPaid.setText("Internship is paid");
        }
        else{
            iPaid.setText("Internship isn't paid");
        }

        TextView iPrereqs = findViewById(R.id.prereqInfoTextView);
        iPrereqs.setText("Prerequisites: " + getIntent().getStringExtra("internship prereqs"));

        TextView iDeadline = findViewById(R.id.deadlineInfoTextView);
        iDeadline.setText("Deadline to apply: " + getIntent().getStringExtra("internship deadline"));

        TextView iDates = findViewById(R.id.datesInfoTextView);
        iDates.setText("Start Date: " + getIntent().getStringExtra("internship start date") +
                "\n" +  "End Date: " + getIntent().getStringExtra("internship end date"));

        TextView iLink = findViewById(R.id.linkInfoTextView);
        iLink.setText("Link to Internship: " + getIntent().getStringExtra("internship link"));

        TextView iDescription = findViewById(R.id.descriptionTextView);
        iDescription.setText("Description: " + getIntent().getStringExtra("internship description"));

    }
}
