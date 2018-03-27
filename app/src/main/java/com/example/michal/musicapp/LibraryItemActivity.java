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

        if (getResources().getString(selectedItem).equals(getResources().getString(R.string.library_albums))){
            ArrayList<Item> selectedItemList = new ArrayList<>();

            //TODO: sprawdzic dlaczego nie da sie dodac obrazka ???
            for (int i=1; i<=20; i++){
                selectedItemList.add(new Item(makeSingular(getResources().getString(selectedItem)) + " " + i,
                        makeSingular(getResources().getString(R.string.library_artists)) + " " + i), R.drawable.ic_album_black_24dp));
            }

            ListView listView = findViewById(R.id.library_selected_item_list);
            ItemAdapter adapter = new ItemAdapter(getApplicationContext(), selectedItemList);
            listView.setAdapter(adapter);
        }


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
