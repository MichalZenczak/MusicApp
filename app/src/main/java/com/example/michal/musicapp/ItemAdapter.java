package com.example.michal.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList selectedItemList){
        super(context,0,selectedItemList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent,false);
        }

        Item currentItem = getItem(position);
        TextView currentItemText1 = listItemView.findViewById(R.id.item_text_1);
        currentItemText1.setText(currentItem.getItemText1());

        TextView currentItemText2 = listItemView.findViewById(R.id.item_text_2);
        if (currentItem.isItemText2Empty()){
            currentItemText2.setText(currentItem.getItemText2());
        }else{
            currentItemText2.setVisibility(View.GONE);
            currentItemText1.setGravity(Gravity.CENTER_VERTICAL);
        }

        ImageView currentItemImage = listItemView.findViewById(R.id.item_image);
        if (currentItem.hasImage()){
            currentItemImage.setImageResource(currentItem.getImageResourceId());
        }else {
            currentItemImage.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
