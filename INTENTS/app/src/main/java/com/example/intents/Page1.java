package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Page1 extends AppCompatActivity {
     TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        txt = findViewById(R.id.textView3);
        String Name = getIntent().getStringExtra("data");
        txt.setText("welcome to page 1");


    }
}
