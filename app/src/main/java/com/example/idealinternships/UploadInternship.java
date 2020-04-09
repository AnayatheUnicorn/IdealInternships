package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UploadInternship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_internship);

        Spinner ageSpinner = findViewById(R.id.ageDropdown);
        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        Spinner genderSpinner = findViewById(R.id.genderDropdown);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(UploadInternship.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.gender));
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);
    }
}
