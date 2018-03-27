package com.example.michal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_library);

        Intent myIntent = getIntent();
        int selectedItem = myIntent.getIntExtra("selectedItem",0);

        TextView selectedItemName = findViewById(R.id.selected_item_id);
        selectedItemName.setText(selectedItem);

        ArrayList<String> selectedItemList = new ArrayList<>();

        for (int i=1; i<=20; i++){
            selectedItemList.add(makeSingular(getResources().getString(selectedItem)) + " " + i);
        }

        ListView listView = findViewById(R.id.library_selected_item_list);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, selectedItemList);
        listView.setAdapter(adapter);

    }
    /**
     * This method takes a string and removes the last character from it.
     * @param plural a string from which to remove the last character
     * @return a string without the last character
     */
    private String makeSingular(String plural){
        return plural.substring(0, plural.length() - 1);
    }
}
