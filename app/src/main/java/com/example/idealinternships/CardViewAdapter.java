/**
 * This class handles the card view for companies to manage the internships that they have posted
 */
package com.example.idealinternships;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {

    private ArrayList<Internship> internships;

    public static class CardViewHolder extends RecyclerView.ViewHolder{

        public ImageView internshipPicView;
        public TextView nameTextView;
        public TextView descriptionTextView;

        /**
         * Sets values to each field in the card
         * @param itemView the view
         */
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            internshipPicView = itemView.findViewById(R.id.internshipPic);
            nameTextView = itemView.findViewById(R.id.internshipNameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }

    /**
     * Constructs a card view adapter object and sets it to an array list of internships
     * @param internshipList the list of internships
     */
    public CardViewAdapter(ArrayList<Internship> internshipList){
        internships = internshipList;
        Log.d("searching", "anaya"+internships.toString());

    }

    /**
     *
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.internship_cardview, parent, false);
        CardViewHolder cvh = new CardViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Internship i = internships.get(position);

        holder.internshipPicView.setImageResource(i.getImageResource());
        holder.nameTextView.setText(i.getName());
        holder.descriptionTextView.setText(i.getInternshipDescription());
    }

    @Override
    public int getItemCount() {
        return internships.size();
    }
}
