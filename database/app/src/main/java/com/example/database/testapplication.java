package com.example.database;

import android.app.Application;

import com.backendless.Backendless;

public class testapplication extends Application
{

    private static final String API_HOST = "https://api.backendless.com";
    private static final String APP_ID = "19D214A4-4332-6B9D-FF0D-F23E113DCC00";
    private static final String APP_KEY = "0E539A84-E79C-9E9E-FFD8-4ABF7D8E9800";
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( API_HOST );
        Backendless.initApp( getApplicationContext(),
               APP_ID,
                APP_KEY );
    }
}
