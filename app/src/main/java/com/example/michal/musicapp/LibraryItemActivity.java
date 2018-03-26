package com.example.michal.musicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by michal on 3/26/18.
 */

public class LibraryItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_library);

        String selectedItem = getIntent().getStringExtra("selectedItem");

        TextView selectedItemName = findViewById(R.id.selected_item_id);
        selectedItemName.setText(selectedItem);

        //TODO: create new activities for the rest of library items
        //TODO: create a list of artist/songs etc. with for loop and a category name of the clicked item above the list


    }
}
