package com.example.contacts;

import android.app.Application;

import java.util.ArrayList;

public class applicationclass extends Application {
    public static ArrayList<person>people;
    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<person>();
        people.add(new person("Abhishek kumar","9583920399"));
        people.add(new person("Mew kumar","983920399"));
        people.add(new person("Kutta kumar","958392399"));

    }
}
