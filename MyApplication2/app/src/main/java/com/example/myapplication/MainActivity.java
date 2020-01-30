package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Listfrag.Itemselected {
        TextView tvdescrip;

        String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvdescrip = findViewById(R.id.tvdecrip);
        descriptions = getResources().getStringArray(R.array.details);
        if(findViewById(R.id.vertical) != null)
        {
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction().hide(fragmentManager.findFragmentById(R.id.horizontal));
            fragmentManager.beginTransaction().show(fragmentManager.findFragmentById(R.id.vertical));
            fragmentManager.beginTransaction().commit();



        }


else
       if(findViewById(R.id.horizontal) != null)
       {

           FragmentManager fragmentManager = this.getSupportFragmentManager();
           fragmentManager.beginTransaction().hide(fragmentManager.findFragmentById(R.id.vertical));
           fragmentManager.beginTransaction().show(fragmentManager.findFragmentById(R.id.horizontal));
           fragmentManager.beginTransaction().commit();
       }
    }

    @Override
    public void onItemselected(int index) {

        tvdescrip.setText(descriptions[0]);
        if(findViewById(R.id.vertical) != null)
        {
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction().hide(fragmentManager.findFragmentById(R.id.horizontal));
            fragmentManager.beginTransaction().show(fragmentManager.findFragmentById(R.id.vertical));
            fragmentManager.beginTransaction().commit();



        }



    }
}
