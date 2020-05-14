package com.example.idealinternships;


import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class TestSearch extends AppCompatActivity {

    private View v;
    private RecyclerView recycler;
    private CardViewAdapterSearch adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList internshipsList;
    private ArrayList internshipFull;

    @Override
    /**
     * Sets the screen to the search screen
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_search);
        //setHasOptionsMenu(true)


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Internships");
        internshipsList = new ArrayList<Internship>();
        internshipFull = new ArrayList<Internship>();


        Log.d("database", "got");


        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            /**
             * Gets internships from Firebase and put them into two array lists
             */
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    Internship i = ds.getValue(Internship.class);
                    internshipsList.add(i);
                    internshipFull.add(i);
                    adapter.notifyDataSetChanged();
                    Log.d("searching", "notify" + internshipsList.toString());
                }

            }

            /**
             * Indicated an error with accessing Firebase
             * @param error the error
             */
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("MainActivity", "Failed to read value.", error.toException());
            }
        });

        recycler = findViewById(R.id.searchInternshipsRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new CardViewAdapterSearch(internshipsList, internshipFull);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);

        //searchView = v.findViewById(R.id.studentSearchView);
        //searchView.setOnQueryTextListener();


    }


    /**
     * Puts the search bar on the screen
     * @param menu the search bar as a menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        Log.d("searching", "onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.search_menu, menu);
        Log.d("searching", "menu inflated");
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            /**
             * When the user presses enter while searching
             * @param s the string in the search bar
             * @return false
             */
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            /**
             * Adjusts the internships desplayed on screen based on what is being searched
             * @param s the string in the search bar
             * @return false
             */
            @Override
            public boolean onQueryTextChange(String s) {
                Log.d("searching","text change");
                adapter.getFilter().filter(s);
                adapter.notifyDataSetChanged();
                Log.d("searching","text change successful");
                return false;
            }
        });

        return true;
    }



}

