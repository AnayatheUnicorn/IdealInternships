package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Company c;

    /**
     * Opens the app
     * @param savedInstanceState the app's state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("test");
        //myRef.setValue("message!");

    }


    /**
     * Takes the app to the enter company info page
     * @param v the view
     */
    public void goToEnterCompanyInfoPage(View v){
        Intent intent = new Intent(this, CompanyEnterInfoActivity.class);
        startActivity(intent);
    }

    /**
     * takes the app to the enter student info page
     * @param v the view
     */
    public void goToStudentInfoPage(View v){
        Intent intent = new Intent(this, StudentEnterInfo.class);
        startActivity(intent);
    }

    /**
     * Takes the app to the company UI
     * @param v the view
     */
    public void goToMyAccCompanyPage(View v){
        Intent intent = new Intent(this, CompanyMyAccActivity.class);
        startActivity(intent);
    }

    public void goToUploadInternshipPage(View v){
        Intent intent = new Intent(this, UploadInternship.class);
        startActivity(intent);
    }



}
