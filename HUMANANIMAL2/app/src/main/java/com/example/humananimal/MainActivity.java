package com.example.humananimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 =findViewById(R.id.b1);
        Button bt2 =findViewById(R.id.b2);
        Button bt3 =findViewById(R.id.b3);
        Button bt4 =findViewById(R.id.b4);
        Button bt5 =findViewById(R.id.b5);
        Button bt6 =findViewById(R.id.b6);
        Button bt7 =findViewById(R.id.b7);
        Button bt8 =findViewById(R.id.b8);
        Button bt9 =findViewById(R.id.b9);
        Button bt10 =findViewById(R.id.b10);
bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,com.example.humananimal.button1.class);
startActivity(intent);

    }
});
    }
}
