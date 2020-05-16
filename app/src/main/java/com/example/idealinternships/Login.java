package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    private EditText mEmail, mPassword;
    private Button mLoginButton;
    private TextView mNewAccButton;
    private FirebaseAuth fAuth;
    private String email;
    private Company c;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = findViewById(R.id.loginCompEmail);
        mPassword = findViewById(R.id.loginCompPassword);
        mLoginButton = findViewById(R.id.loginButton);
        mNewAccButton = findViewById(R.id.newHere);

        fAuth = FirebaseAuth.getInstance();

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                final Intent intent3 = new Intent(getApplicationContext(), CompanyMyAccActivity.class);
                final Intent intent2 = new Intent(getApplicationContext(), UploadInternshipFragment.class);

                bundle = new Bundle();
                final CompanyMyAccFragment objects = new CompanyMyAccFragment();

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Companies");

                myRef.addValueEventListener(new ValueEventListener() {
                    /**
                     * Gets companies from Firebase and checks if they are the one logging in
                     * @param dataSnapshot
                     */
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        Log.d("database", "random");
                        for(DataSnapshot ds: dataSnapshot.getChildren()){
                            c = ds.getValue(Company.class);
                            if(c.getEmail().equals(email)){
                                Log.d("database", c.toString());
                                bundle.putString("company name", "problem");
                                intent2.putExtra("company name", c.getName());
                                bundle.putString("company bio", c.getBio());
                                bundle.putString("company location", c.getLocation());
                                bundle.putString("company link", c.getLink());
                            }
                        }
                    }

                    /**
                     * Indicates an error in accessing Firebase
                     * @param error error
                     */
                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w("MainActivity", "Failed to read value.", error.toException());
                    }
                });

                objects.setArguments(bundle);

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("email is required");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    mPassword.setError("password is required");
                    return;
                }

                if(password.length() <6){
                    mPassword.setError("password must be at least 6 characters");
                    return;
                }

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this,"Successful login",Toast.LENGTH_SHORT).show();

                            Log.d("database", "got 2.0");
                            Log.d("database", email);

                            startActivity(intent3);

                        }
                        else{
                            Toast.makeText(Login.this,"Error!",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        mNewAccButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });


    }
}
