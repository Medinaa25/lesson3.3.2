package com.example.lesson332;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList <String> streets = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        streets.add("Sovetskaya");
        streets.add("Kievskaya");
        streets.add("Bakambaeva");
        streets.add("Moskovskaya");
        streets.add("Doneckaya");
        streets.add("Isanova");
        streets.add("prospect Mira");
        streets.add("Ahunbaeva");
        streets.add("Maldybaeva");
        streets.add("Logvinenko");
        StreetsAdapter streetsAdapter = new StreetsAdapter(streets);
        recyclerView.setAdapter(streetsAdapter);
    }
}