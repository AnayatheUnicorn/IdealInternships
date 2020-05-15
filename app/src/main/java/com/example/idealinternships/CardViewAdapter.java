/**
 * This class handles the card view for companies to manage the internships that they have posted
 */
package com.example.idealinternships;

import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {

    private ArrayList<Internship> internships;

    public static class CardViewHolder extends RecyclerView.ViewHolder{

        public TextView nameTextView;
        public TextView descriptionTextView;
        public Button seeMoreButton;

        /**
         * Sets values to each field in the card
         * @param itemView the view
         */
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.internshipNameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            seeMoreButton = itemView.findViewById(R.id.seeMoreButton);
        }
    }

    /**
     * Constructs a card view adapter object and sets it to an array list of internships
     * @param internshipList the list of internships
     */
    public CardViewAdapter(ArrayList<Internship> internshipList){
        internships = internshipList;

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
        final Internship i = internships.get(position);

        holder.nameTextView.setText(i.getName());
        holder.descriptionTextView.setText(i.getInternshipDescription());

        holder.seeMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InternshipSeeMore.class);
                intent.putExtra("internship name", i.getName());
                intent.putExtra("internship company", i.getCompany().getName());
                intent.putExtra("internship fields", i.getFields());
                intent.putExtra("internship min age", i.getMinAge());
                intent.putExtra("internship max age", i.getMaxAge());
                intent.putExtra("internship min grade", i.getMinGrade());
                intent.putExtra("internship max grade", i.getMaxGrade());
                intent.putExtra("internship genders", i.getTargetGender());
                intent.putExtra("internship races", i.getTargetRaces());
                intent.putExtra("internship military", i.isMilitaryExperience());
                intent.putExtra("internship income", i.getTargetIncome());
                intent.putExtra("internship location", i.getLocation());
                intent.putExtra("internship cost", i.getCost());
                intent.putExtra("internship paid", i.isPaid());
                intent.putExtra("internship prereqs", i.getPreReqs());
                intent.putExtra("internship deadline", i.getApplicationDeadline().toString());
                intent.putExtra("internship start date", i.getStartDate().toString());
                intent.putExtra("internship end date", i.getEndDate().toString());
                intent.putExtra("internship link", i.getInternshipLink());
                intent.putExtra("internship description", i.getInternshipDescription());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return internships.size();
    }
}
