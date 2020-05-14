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

        Internship i = new Internship();

        ImageView iPic = findViewById(R.id.internshipImage);
        iPic.setImageResource(i.getImageResource());

        TextView iName = findViewById(R.id.internshipNameTextView);
        iName.setText(i.getName());

        TextView iCompany = findViewById(R.id.internshipCompanyTextView);
        iCompany.setText("Company: " + i.getCompany());

        TextView iField = findViewById(R.id.fieldnfoTextView);
        iField.setText("Field: " + i.getFields());

        TextView iAge = findViewById(R.id.ageInfoTextView);
        iAge.setText("Minimum Age Accepted:" + i.getMinAge() + " Maximum Age Accepted: " + i.getMaxAge());

        TextView iGrade = findViewById(R.id.gradeInfoTextView);
        iGrade.setText("Minimum Grade Accepted: " + i.getMinGrade() + " Maximum Grade Accepted: " + i.getMaxGrade());

        TextView iGender = findViewById(R.id.genderInfoTextView);
        iGender.setText("Genders Accepted: " + i.getTargetGender());

        TextView iRace = findViewById(R.id.raceInfoTextView);
        iRace.setText("Races Accepted: " + i.getTargetRaces());

        TextView iMilitary = findViewById(R.id.militaryInfoTextView);
        if (i.isMilitaryExperience()) {
            iMilitary.setText("Military Info: ");
        }
        else{
            iMilitary.setText("");
        }

    }
}
