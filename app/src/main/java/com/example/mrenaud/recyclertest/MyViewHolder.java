package com.example.mrenaud.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static android.content.ContentValues.TAG;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView textViewView;
    private ImageView imageView;


    public MyViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    public void bind(Animal myObject) {
        textViewView.setText(myObject.getText());
        Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);

    }

    @Override
    public void onClick(final View itemView) {
        Log.d(TAG,"onClick"+ getPosition()+" "+imageView);
   //     int itemPosition = RecyclerView.getChildLayoutPosition(itemView);
     //   String item =
    }
}