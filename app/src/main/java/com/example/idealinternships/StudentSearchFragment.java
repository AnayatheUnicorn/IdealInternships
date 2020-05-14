
/**
 * This class corresponds to the compnany manage internships page after clicking on 'manage' in the bottom navigation bar
 */
package com.example.idealinternships;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

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

public class StudentSearchFragment extends Fragment implements SearchView.OnQueryTextListener, MenuItem.OnActionExpandListener {

    private View v;
    private RecyclerView recycler;
    private CardViewAdapterSearch adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList internshipsList;
    private ArrayList internshipFull;
    private SearchView searchView;
    private SearchView.OnQueryTextListener queryTextListener;


    /**
     * Opens the student search page after clicking on this page in the bottom navigation bar
     * @param inflater inflater
     * @param conatiner the part of the screen above the navigation bar
     * @param savedInsatnceState the app's state
     * @return the manage interships view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup conatiner, @Nullable Bundle savedInsatnceState){
        v = inflater.inflate(R.layout.student_search_fragment, conatiner,false);
        setHasOptionsMenu(true);
        internshipsList = new ArrayList<Internship>();
        internshipFull = new ArrayList<Internship>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Internships");
        internshipsList = new ArrayList<Internship>();
        internshipFull = new ArrayList<Internship>();


        Log.d("database", "got");


        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
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

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("MainActivity", "Failed to read value.", error.toException());
            }
        });

        recycler = v.findViewById(R.id.searchInternshipsRecyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new CardViewAdapterSearch(internshipsList, internshipFull);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);

        return v;
    }

   @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){

        inflater.inflate(R.menu.search_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        Log.d("searching","text change");
        adapter.getFilter().filter(s);
        adapter.notifyDataSetChanged();
        Log.d("searching","text change successful");
        return false;
    }


}



