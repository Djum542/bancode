package com.example.myapplication;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
CardView cardView;
Toolbar toolbar;
ViewFlipper viewFlipper;
NavigationView navigationView;
RecyclerView recyclerView;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
    }
    public  void anhxa(){
        toolbar = findViewById(R.id.menumain);
        viewFlipper = findViewById(R.id.viewfliper);
        recyclerView = findViewById(R.id.recycler);
        listView = findViewById(R.id.lisview);
        navigationView = findViewById(R.id.navigation);
    }
}