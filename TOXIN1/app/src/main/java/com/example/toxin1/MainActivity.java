package com.example.toxin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btnSubmit;
    TextView tvResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDno = etID.getText().toString().trim();
                String name = IDno.substring(6,10);
                String result=getString(R.string.final_ans);
                if(name.equals(getString(R.string.r1)))
                    result=getString(R.string.n1);
                else
                    if(name.equals(getString(R.string.r2)))
                        result=getString(R.string.n2);
                    else
                        if(name.equals(getString(R.string.r3)))
                            result=getString(R.string.n3);
                        else
                            if(name.equals(getString(R.string.r4)))
                                result=getString(R.string.n4);
                else
                if(name.equals(getString(R.string.r5)))
                    result=getString(R.string.n5);
                else
                    if(name.equals(getString(R.string.r6)))
                        result=getString(R.string.n6);
                    else
                        if(name.equals(getString(R.string.r7)))
                            result=getString(R.string.n7);
                        else
                            if(name.equals(getString(R.string.r8)))
                                result=getString(R.string.n8);

                            String Text = getString(R.string.final_ans) + result;
                            tvResults.setText(Text);
            }
        });

    }
}
