package com.example.sorry;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
       btn2 = findViewById(R.id.btn2);
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=sorry&oq=sorry&aqs=chrome..69i57j35i39l2j0l3.1581j0j7&sourceid=chrome&ie=UTF-8"));
               startActivity(intent);
           }
       });
    }
}
