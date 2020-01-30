package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class personAdapter extends RecyclerView.Adapter<personAdapter.Viewholder>
{
    private ArrayList<person> people;
    onitemselected activity;
    public interface onitemselected
    {
        void itemclicked(int index);
    }

    public personAdapter(Context context,ArrayList<person> list)
    {
        people = list;
        activity = (onitemselected)context;
    }

    public class Viewholder extends  RecyclerView.ViewHolder
    { ImageView iv;
    TextView tv1;
    TextView tv2;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            iv = itemView.findViewById(R.id.iv);
             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     activity.itemclicked(people.indexOf((person)v.getTag()));

                 }
             });
        }
    }
    @NonNull
    @Override
    public personAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items,viewGroup,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull personAdapter.Viewholder viewHolder, int i) {
        viewHolder.itemView.setTag(people.get(i));
        viewHolder.tv1.setTag(people.get(i).getName());
        viewHolder.tv2.setTag(people.get(i).getSurname());
        if(people.get(i).getPreferrence().equals("bus"))
        {

viewHolder.iv.setImageResource(R.drawable.bus);
    }
        else
            if(people.get(i).getPreferrence().equals("plane")) {


                viewHolder.iv.setImageResource(R.drawable.plane);
            }
            }
    @Override
    public int getItemCount() {
        return people.size();
    }}

