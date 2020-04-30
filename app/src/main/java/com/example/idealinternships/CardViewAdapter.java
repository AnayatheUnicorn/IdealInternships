package com.example.idealinternships;

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

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            internshipPicView = itemView.findViewById(R.id.internshipPic);
            nameTextView = itemView.findViewById(R.id.internshipNameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }

    public CardViewAdapter(ArrayList<Internship> internshipList){
        internships = internshipList;
    }

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
        //holder.descriptionTextView.setText(i.getDescription());
    }

    @Override
    public int getItemCount() {
        return internships.size();
    }
}
