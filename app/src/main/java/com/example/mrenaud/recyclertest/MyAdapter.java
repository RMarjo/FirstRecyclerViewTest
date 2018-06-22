package com.example.mrenaud.recyclertest;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<MyObject> list;

    public MyAdapter(List<MyObject> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_cards, viewGroup, false);
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}