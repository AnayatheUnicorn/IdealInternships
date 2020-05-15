/**
 * This class corresponds to the compnany manage internships page after clicking on 'manage' in the bottom navigation bar
 */
package com.example.idealinternships;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ManageFragment extends Fragment {


    private View v;
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Internship> internshipsList;

    /**
     * Opens the manage internships company page after clicking on this page in the bottom navigation bar
     * @param inflater inflater
     * @param conatiner the part of the screen above the navigation bar
     * @param savedInsatnceState the app's state
     * @return the manage internships view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup conatiner, @Nullable Bundle savedInsatnceState){

        v = inflater.inflate(R.layout.uploaded_internships_fragment, conatiner,false);

        internshipsList = new ArrayList<Internship>();

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Internships");

        Log.d("database", "got");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            /**
             * Gets internships from Firebase and puts tem into an array list
             * @param dataSnapshot
             */
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    Internship i = ds.getValue(Internship.class);
                    internshipsList.add(i);
                    adapter.notifyDataSetChanged();
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



        recycler = v.findViewById(R.id.manageinternshipsRecyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new CardViewAdapter(internshipsList);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);

        return v;

    }
}
