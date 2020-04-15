/**
 * This class corresponds to the compnany manage internships page after clicking on 'manage' in the bottom navigation bar
 */
package com.example.idealinternships;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ManageFragment extends Fragment {
    /**
     * Opens the manage internships company page after clicking on this page in the bottom navigation bar
     * @param inflater inflater
     * @param conatiner the part of the screen above the navigation bar
     * @param savedInsatnceState the app's state
     * @return the manage interships view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup conatiner, @Nullable Bundle savedInsatnceState){
        return inflater.inflate(R.layout.uploaded_internships_fragment, conatiner,false);
    }
}
