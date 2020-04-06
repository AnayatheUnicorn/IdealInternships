package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
    private void testMethod(){
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
        System.out.println("random");
    }


    private void nonsense(){
        System.out.println("hello world");
        System.out.println("this is a test");

    }


}
