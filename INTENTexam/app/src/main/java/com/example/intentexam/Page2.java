package com.example.intentexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
    TextView tv6,tv7,tv8,tv9;
    ImageView iv7,iv8,iv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        TextView tv6 = findViewById(R.id.tv6);
        TextView tv7 = findViewById(R.id.tv7);
        TextView tv8 = findViewById(R.id.tv8);
        TextView tv9 = findViewById(R.id.tv9);
        ImageView iv7 = findViewById(R.id.iv7);
        ImageView iv8 = findViewById(R.id.iv8);
        ImageView iv9 = findViewById(R.id.iv9);

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                iv7.setImageResource();
            }
        });

    }
}
