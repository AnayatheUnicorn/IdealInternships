package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText mEmail, mPassword;
    private Button mLoginButton;
    private TextView mNewAccButton;
    private FirebaseAuth fAuth;

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
                String email = mEmail.getText().toString().trim();
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

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            //Toast.makeText(Login.this,"Successful login",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), CompanyMyAccActivity.class);
                            startActivity(intent);
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
