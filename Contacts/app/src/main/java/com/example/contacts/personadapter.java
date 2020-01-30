package com.example.contacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public  class personadapter extends RecyclerView.Adapter<personadapter.ViewHolder>{
    onitemclick activity;
    private ArrayList<person> people;

    public interface onitemclick
    {
        void itemselected(int index);
    }

    public personadapter(Context context, ArrayList<person>list)
    {
        list = people;
        activity =(onitemclick) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv1name;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1name = itemView.findViewById(R.id.tv1name);

           itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.itemselected(people.indexOf((person)v.getTag()));

                }
            });

        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_display,viewGroup,false);

      return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
  viewHolder.itemView.setTag(people.get(i));
  viewHolder.tv1name.setTag(people.get(i).getName());

    }


    @Override
    public int getItemCount() {
        people.size();
        return 0;
    }
}
