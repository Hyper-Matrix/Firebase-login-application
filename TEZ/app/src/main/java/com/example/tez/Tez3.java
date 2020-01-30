package com.example.tez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tez3 extends AppCompatActivity {
    Button bt5;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tez3);
        TextView tv5 = findViewById(R.id.tv5);
        Button bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:9583920399"));
                startActivity(intent);
            }
        });
    }
}
