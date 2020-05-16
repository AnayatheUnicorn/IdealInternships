package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    private EditText mCompanyName, mEmail, mPassword;
    private Button mRegisterButton;
    private TextView mLoginButton;
    private FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mCompanyName = findViewById(R.id.enterCompName);
        mEmail = findViewById(R.id.enterCompEmail);
        mPassword = findViewById(R.id.enterCompPassword);
        mRegisterButton = findViewById(R.id.registerButton);
        mLoginButton = findViewById(R.id.alreadyHaveAcc);

        fAuth = FirebaseAuth.getInstance();


        if(fAuth.getCurrentUser() != null){
            Intent intent = new Intent(getApplicationContext(), CompanyMyAccActivity.class);
            startActivity(intent);
        }

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

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



                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Register.this,"User created",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), CompanyEnterInfoActivity.class);
                            intent.putExtra("company email", email);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(Register.this,"Error"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }
}
