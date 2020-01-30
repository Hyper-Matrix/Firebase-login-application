package com.example.intentexam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    ImageView iv,iv1,iv2;
    Button bt1;
    int pg2 = 2;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == pg2)
        {if(resultCode == RESULT_OK)
        {
          iv.setVisibility(View.VISIBLE);
          iv1.setVisibility(View.VISIBLE);
          iv2.setVisibility(View.VISIBLE);
        }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.tv1);
       ImageView iv = findViewById(R.id.iv);
        ImageView iv1 = findViewById(R.id.iv1);
        ImageView iv2 = findViewById(R.id.iv2);
        Button bt1 = findViewById(R.id.bt1);
        iv.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,com.example.intentexam.Page2.class);
                intent.p
                startActivityForResult(intent,pg2);

            }
        });




    }
}
