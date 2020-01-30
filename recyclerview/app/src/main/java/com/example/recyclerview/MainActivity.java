package com.example.recyclerview;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;


import java.util.ArrayList;

import static com.example.recyclerview.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements personAdapter.onitemselected{

    RecyclerView recyclerView;
    RecyclerView.Adapter myadapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<person> people;
    Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
Button btn = findViewById(R.id.btn);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        people.add(new person("mew","two","bus"));
        myadapter.notifyDataSetChanged();
    }
});
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        //layoutManager = new LinearLayoutManager(this);
        layoutManager = new GridLayoutManager(this,4,GridLayout.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        people = new ArrayList<person>();
        people.add(new person("Abhishek","Kumar","bus"));
        people.add(new person("Tony","stark","plane"));
        people.add(new person("anisha","biswal","bus"));
        people.add(new person("deba","mohanty","plane"));
        people.add(new person("trideep","barik","plane"));

        myadapter = new personAdapter(this,people);
        recyclerView.setAdapter(myadapter);


    }

    @Override
    public void itemclicked(int index) {
        Toast.makeText(this,"surname"+people.get(index).getSurname(),Toast.LENGTH_SHORT).show();
    }
}

