package com.example.myapplication;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Listfrag extends ListFragment {
    Itemselected activity;
    public  interface Itemselected{
        void onItemselected(int index);
    }


    public Listfrag() {
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (Itemselected)context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String [] data;
        data = getResources().getStringArray(R.array.members);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data));
        activity.onItemselected(0);
        
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        activity.onItemselected(position);
    }
}
