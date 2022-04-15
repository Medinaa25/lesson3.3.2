package com.example.lesson332;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StreetsAdapter extends RecyclerView.Adapter<StreetsViewHolder>  {
    private ArrayList <String> streets = new ArrayList<>();

    public StreetsAdapter(ArrayList<String> streets) {
        this.streets = streets;
    }

    @NonNull
    @Override
    public StreetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StreetsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_streets,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StreetsViewHolder holder, int position) {
        holder.bind(streets.get(position));
    }

    @Override
    public int getItemCount() {
        return streets.size();
    }
}
