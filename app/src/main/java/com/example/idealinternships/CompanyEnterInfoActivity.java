/**
 * This class takes in information about a company and uploads it to firebase
 */
package com.example.idealinternships;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.MalformedURLException;

public class CompanyEnterInfoActivity extends AppCompatActivity {

    private Company c;

    @Override
    /**
     * Opens the page for companies to enter their information
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_enter_info);
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

    }

    /**
     * Uploads company name, description, location, and link the database
     * @param v view
     */
    public void saveCompanyInfo(View v)  {
        AutoCompleteTextView companyNameRaw = findViewById(R.id.companyNameEditable);
        EditText companyDescriptionRaw = findViewById(R.id.companyBioEditable);
        EditText companyLocationRaw = findViewById(R.id.companyLocationEditable);
        AutoCompleteTextView companyLinkRaw = findViewById(R.id.companyLinkEditable);
        ImageView companyPFPRaw = findViewById(R.id.companyChoosePFP);
        c = new Company(companyNameRaw.getText().toString(),companyDescriptionRaw.getText().toString(),companyLocationRaw.getText().toString(),companyLinkRaw.getText().toString());

       // DatabaseReference usersRef = ref.child("users");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Companies");
        DatabaseReference cRef = ref.child(c.getName());
        cRef.setValue(c);


        //code to open the company upload internship page
        Intent intent = new Intent(this, CompanyMyAccActivity.class);
        startActivity(intent);

    }

    //public void selectCompanyPFP(View v){
        //imageView.setImageResource
   // }
}
