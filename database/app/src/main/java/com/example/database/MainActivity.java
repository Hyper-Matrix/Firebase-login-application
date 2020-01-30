package com.example.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class MainActivity extends AppCompatActivity {
WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.wv);
        wv.loadUrl("https://www.udemy.com/course/learn-android-application-development-y/learn/lecture/11152550#overview");

        details det = new details();
        det.setName("Abhishek");
        det.setSurname("Kumar");
        Backendless.Data.of(details.class).save(det, new AsyncCallback<details>() {
            @Override
            public void handleResponse(details response) {

            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });





    }

}
