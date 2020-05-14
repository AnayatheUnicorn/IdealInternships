package com.example.idealinternships;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StudentUiDefault extends AppCompatActivity {

    /**
     * Opens the student interface
     * @param savedInstanceState the app's state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ui_default);


        BottomNavigationView bottomNavView;


        bottomNavView = findViewById(R.id.bottom_navigation_student);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new StudentHomeFragment()).commit();

        }

        bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;

                switch (menuItem.getItemId()) {
                    case R.id.nav_home_student:
                        fragment = new StudentHomeFragment();
                        break;
                    case R.id.nav_search_student:
                        //fragment = new UploadFragment();
                        fragment = new StudentSearchFragment();
                        break;
                    case R.id.nav_starred_student:
                        fragment = new StudentSavedFragment();
                        break;

                    case R.id.nav_my_acc_student:
                        fragment = new StudentMyAccFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
    }

}
