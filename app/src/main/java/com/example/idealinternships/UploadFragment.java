/**
 * A temporary class that will be replaced w the upload internship activity. This corresponds to the page reached when pressing upload
 * in the bottom navigation bar
 */
package com.example.idealinternships;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class UploadFragment extends Fragment {

    /**
     * Opens the temporary upload internship page when clicked on in te bottom navigation bar
     * @param inflater inflater
     * @param conatiner the part of the screen above tha naviagtion menu
     * @param savedInsatnceState the app's state
     * @return the temporary upload internship view
     */
    //turn maxi's upload internship activity into a fragment and delete this class
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup conatiner, @Nullable Bundle savedInsatnceState){
        return inflater.inflate(R.layout.upload_fragment, conatiner,false);
    }
}
