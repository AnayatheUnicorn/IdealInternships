/**
 * This class corresponds to the screen a company will see when they click on 'my account' in the bottom navigation bar
 */
package com.example.idealinternships;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CompanyMyAccFragment extends Fragment {

    /**
     * Open the my account page for companies when clicked on from the bottom navigation bar
     * @param inflater inflater
     * @param container the part of the screen above the navigation bar
     * @param savedInsatnceState te app's state
     * @return the My Account view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInsatnceState){
        return inflater.inflate(R.layout.company_my_acc_fragment, container,false);
    }

}
