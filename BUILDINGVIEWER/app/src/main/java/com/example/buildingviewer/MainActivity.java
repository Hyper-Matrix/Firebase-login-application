package com.example.buildingviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etFROM;
EditText etTO;
Button btNAVIGATE;
TextView tvRESULT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFROM = findViewById(R.id.etFROM);
        etTO = findViewById(R.id.etTO);
        btNAVIGATE = findViewById(R.id.btNAVIGATE);
        tvRESULT = findViewById(R.id.tvRESULT);

        btNAVIGATE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(etFROM.getText().toString().isEmpty() || etTO.getText().toString().isEmpty())
{
    Toast.makeText(MainActivity.this, "ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
            }
            else
{

}
        });

    }
}
