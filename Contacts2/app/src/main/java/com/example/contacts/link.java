package com.example.contacts;

import android.app.Application;

import com.backendless.Backendless;

public class link extends Application
{

    public static final String APPLICATION_ID = "44D732A3-B5A9-2803-FF21-2412EC34DE00";
    public static final String API_KEY = "B6814E28-E902-30E6-FFAF-13F63AB28100";
    public static final String SERVER_URL = "https://api.backendless.com";


    @Override
    public void onCreate() {


        super.onCreate();
        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),
                APPLICATION_ID,
                API_KEY);

    }
}
