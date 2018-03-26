package com.example.michal.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryItemAdapter extends ArrayAdapter<LibraryListItem> {

    public LibraryItemAdapter(Activity context, ArrayList myLibrary){
        super(context,0, myLibrary);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.library_item, parent, false);
        }
        // Get current Item object in the list at this position
        LibraryListItem currentItem = getItem(position);
        // Find the ImageView ID of the list item object
        ImageView currentItemImage = listItemView.findViewById(R.id.library_item_image);
        // Get the image of current item object and set it to the ImageView
        currentItemImage.setImageResource(currentItem.getItemImageResourceId());
        // Find the TextView ID of the list item object
        TextView currentItemText = listItemView.findViewById(R.id.library_item_text);
        //Get the text of the current item object and set it to the TextView
        currentItemText.setText(currentItem.getItemTextResourceId());

        return listItemView;
    }
}
