package com.example.contacts;

import android.app.Application;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements personadapter.onitemclick{
    TextView tvname,tvsurname;
    EditText etname,etsurname;
    ImageView iv;
    Button btn;
    FragmentManager fragmentManager;
    List list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname = findViewById(R.id.tvname);
        tvsurname =findViewById(R.id.tvsurname);
        etname = findViewById(R.id.etname);
        etsurname = findViewById(R.id.etsurname);
        btn = findViewById(R.id.btn);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        final List list = (List) fragmentManager.findFragmentById(R.id.listfrag);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applicationclass.people.add(new person(etname.getText().toString().trim(),etsurname.getText().toString().trim()));
etname.setText(null);
etsurname.setText(null);
list.notifysetchanged();
            }
        });

    }

    @Override
    public void itemselected(int index) {
        tvname.setText(applicationclass.people.get(index).getName());
        tvsurname.setText(applicationclass.people.get(index).getNumber());
    }
}
