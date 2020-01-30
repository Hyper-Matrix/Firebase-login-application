package com.example.foodieseditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.net.Uri.*;

public class COPYPART extends AppCompatActivity {
    TextView tv8;
    Button bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copypart);
        final TextView tv8 = findViewById(R.id.tv8);
        Button bt2 = findViewById(R.id.bt2);
        Button bt3 = findViewById(R.id.bt3);
        String Data= getIntent().getStringExtra("ANSWER");
        tv8.setText(Data);
        final String foodie = tv8.getText().toString();
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager= (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                clipboardManager.setText((CharSequence) foodie);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://instagram.com/_u/__f.o.o.d.i.e.s__"));
                intent.setPackage("com.instegram.android");
                        try {
                        startActivity(intent);

                        }catch (ActivityNotFoundException e)
                        {startActivity(new Intent((Intent.ACTION_VIEW), Uri.parse("http://instagram.com/__f.o.o.d.i.e.s__")));
                        }
                        };
                        });
                        }}
