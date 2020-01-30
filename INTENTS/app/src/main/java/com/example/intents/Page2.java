package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    EditText et1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        et1 = findViewById(R.id.editText2);
    bt1 = findViewById(R.id.button2);

    bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String surname = et1.getText().toString().trim();
            Intent intent = new Intent();
            intent.putExtra("surname",surname);
            setResult(RESULT_OK, intent);
            Page2.this.finish();
        }

    });
}}
