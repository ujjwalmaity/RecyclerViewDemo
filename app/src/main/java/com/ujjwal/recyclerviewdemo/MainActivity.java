package com.ujjwal.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] language = {"JavaScript", "Python", "Java", "C", "C++", "PHP", "Swift", "C#", "Ruby", "Objective-C", "SQL", "Go", "Perl", "Scala", "Apex", "R", "SAS"};
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, language);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    protected void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
