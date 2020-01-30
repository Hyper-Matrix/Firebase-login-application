package com.example.contacts;


import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class List extends Fragment {
RecyclerView recyclerView;
RecyclerView.Adapter myadapter;
RecyclerView.LayoutManager layoutManager;
View v;


    public List() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_list, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = v.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        myadapter = new personadapter(this.getActivity(), applicationclass.people);
        recyclerView.setAdapter(myadapter);

    }

    public  void notifysetchanged(){
        myadapter.notifyDataSetChanged();

    }
}


