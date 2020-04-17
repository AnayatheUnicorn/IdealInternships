/**
 * This class corresponds to the default page (my account page) that a company will go to after inputting their information.
 * This class handles the company bottom navigation bar.
 */
package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CompanyMyAccActivity extends AppCompatActivity {

    BottomNavigationView bottomNavView;

    /**
     * Opens the my account page for companies and displays a bottom navigation bar consisting of
     * upload an internship, manage internships, and my account
     * @param savedInstanceState the app's state
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_my_acc);

        bottomNavView = findViewById(R.id.bottom_navigation_company);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UploadFragment()).commit();

        }

        bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               Fragment fragment = null;

               switch(menuItem.getItemId()){
                   case R.id.nav_uploaded_internships_company:
                       fragment = new ManageFragment();
                       break;
                   case R.id.nav_upload_company:
                       //fragment = new UploadFragment();
                       fragment = new UploadFragment();
                       break;
                   case R.id.nav_my_acc_company:
                       fragment = new CompanyMyAccFragment();
                      break;
               }
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                return true;
            }
        });
    }


}
