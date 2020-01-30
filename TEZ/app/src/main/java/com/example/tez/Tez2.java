package com.example.tez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tez2 extends AppCompatActivity {
    TextView tv0;
    Button bt0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tez2);
        TextView tv0 = findViewById(R.id.tv0);
        Button bt0 = findViewById(R.id.bt0);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://instagram.com/_u/ak_toxin"));
                intent.setPackage("com.instegram.android");
                try {
                    startActivity(intent);

                }catch (ActivityNotFoundException e)
                {startActivity(new Intent((Intent.ACTION_VIEW), Uri.parse("http://instagram.com/ak_toxin")));
                }
            };
        });
    }}

