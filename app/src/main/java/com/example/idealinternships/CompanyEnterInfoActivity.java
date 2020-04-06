package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CompanyEnterInfoActivity extends AppCompatActivity {

    private Company c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_enter_info);
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

    }

    public void saveCompanyInfo(View v){
        AutoCompleteTextView companyNameRaw = findViewById(R.id.companyNameEditable);
        c.setName(companyNameRaw.getText().toString());
        EditText companyDescriptionRaw = findViewById(R.id.companyBioEditable);
        c.setBio(companyDescriptionRaw.getText().toString());
        EditText companyLocationRaw = findViewById(R.id.companyLocationEditable);
        c.setLocation(companyLocationRaw.getText().toString());
        AutoCompleteTextView companyLinkRaw = findViewById(R.id.companyLinkEditable);
        c.setLink(companyLinkRaw.getText().toString());

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("companies");
        //myRef.push().setValue(c);




        //code to open the company home page
        //startActivity()
    }

}
