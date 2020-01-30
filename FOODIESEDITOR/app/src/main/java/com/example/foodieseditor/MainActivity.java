package com.example.foodieseditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv2,tv3,tv4,tv5,tv6,tv7;
    EditText et3,et4,et6,et7,et8,et9;
    Button bt1,bt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);
        TextView tv7 = findViewById(R.id.tv7);
        final EditText et3 = findViewById(R.id.et3);
        final EditText et4 = findViewById(R.id.et4);
        final EditText et6 = findViewById(R.id.et6);
        final EditText et7 = findViewById(R.id.et7);
        final EditText et8 = findViewById(R.id.et8);
        final EditText et9 = findViewById(R.id.et9);
        Button bt1 = findViewById(R.id.bt1);
        Button bt3 = findViewById(R.id.bt3);

        String location =  et6.getText().toString().trim();
        String Dish = et3.getText().toString().trim();
        String Cost = et4.getText().toString().trim();
        String Rating = et7.getText().toString().trim();
        String Review = et8.getText().toString().trim();
        String tag = et9.getText().toString().trim();

        final String answer = "DISH :"+Dish+"\n"+"COST : INR"+Cost+"\n"+"Rating :"+Rating+"/5"+"\n"+"Location"+location+"\n"+"-------------------------------"+"\n"+Review+"\n"+"-------------------------------"+"\n"+"DO Visit \n "+tag+"\n With your loved ones"+"\n"+"-------------------------------"+"\n"+"Follow\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\nFor More Such Yummy Posts"+"\n"+"-------------------------------";

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Patia"));
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location =  et6.getText().toString().trim();
                String Dish = et3.getText().toString().trim();
                String Cost = et4.getText().toString().trim();
                String Rating = et7.getText().toString().trim();
                String Review = et8.getText().toString().trim();
                String tag = et9.getText().toString().trim();

                String answer = "DISH :"+Dish+"\n"+"COST : INR"+Cost+"\n"+"Rating :"+Rating+"/5"+"\n"+"Location"+location+"\n"+"-------------------------------"+"\n"+Review+"\n"+"-------------------------------"+"\n"+"DO Visit \n "+tag+"\n With your loved ones"+"\n"+"-------------------------------"+"\n"+"Follow\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_\n@_f.o.o.d.i.e.s_@_f.o.o.d.i.e.s_\nFor More Such Yummy Posts"+"\n"+"-------------------------------";
                Intent intent = new Intent(MainActivity.this,com.example.foodieseditor.COPYPART.class);
                intent.putExtra("ANSWER",answer);
                startActivity(intent);


            }
        });
    }
}
