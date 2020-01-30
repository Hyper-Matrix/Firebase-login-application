package com.example.intents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button bt1;
    Button bt2;
    TextView tv3;
    int page2 = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView3);
        bt1 = findViewById(R.id.button9);
        bt2 = findViewById(R.id.button10);
        tv3 = findViewById(R.id.textView4);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "PLEASE ENTER TEXT", Toast.LENGTH_SHORT).show();

                } else {
                    String Name = txt.getText().toString().trim();
                    Intent intro = new Intent(MainActivity.this, com.example.intents.Page1.class);
                    intro.putExtra("data", Name);

                    startActivity(intro);


                }

            }


        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,package com.example.intents.Page2.class)
                ;
                startActivityForResult(intent, page2);


            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == page2) {
            if (resultCode == RESULT_OK) {
                tv3.setText(data.getStringExtra("surname"));
            }
        }
        if (resultCode == RESULT_CANCELED) {
            tv3.setText("no text received");
        }
    }
}