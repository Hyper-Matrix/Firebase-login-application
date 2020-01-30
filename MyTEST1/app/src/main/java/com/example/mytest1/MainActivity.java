package com.example.mytest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "in Oncreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "in OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "in OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "in OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "in OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "in OnDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "in OnRestart()");
    }
}

