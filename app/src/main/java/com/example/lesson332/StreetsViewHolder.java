package com.example.lesson332;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StreetsViewHolder extends RecyclerView.ViewHolder {
    private TextView streetName;
    public StreetsViewHolder(@NonNull View itemView) {
        super(itemView);
        streetName = itemView.findViewById(R.id.streetName);

    }
    public void bind (String streets){
        streetName.setText(streets);
    }

}
