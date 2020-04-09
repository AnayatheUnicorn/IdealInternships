package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Company c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("test");

    }

    public void goToEnterCompanyInfoPage(View v){
        Intent intent = new Intent(this, CompanyEnterInfoActivity.class);
        startActivity(intent);
    }

    public void goToStudentInfoPage(View v){
        Intent intent = new Intent(this, StudentEnterInfo.class);
        startActivity(intent);
    }

    public void goToUploadInternshipPage(View v){
        Intent intent = new Intent(this, UploadInternship.class);
        startActivity(intent);
    }


}