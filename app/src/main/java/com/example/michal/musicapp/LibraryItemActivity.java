package com.example.michal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryItemActivity extends AppCompatActivity {

    private int mSelectedItem;
    private static final int ITEM_PLAY_ACTIVITY_REQUEST_CODE = 0;


    /**
     * This method is called when the child activity is finished. It retrieves the selectedItem ID back.
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ITEM_PLAY_ACTIVITY_REQUEST_CODE){
            if (resultCode == RESULT_OK){
                mSelectedItem = data.getIntExtra("selectedItem",0);
            }
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final int LIST_ITEM_COUNT = 20;
        super.onCreate(savedInstanceState);

        Intent myIntent = getIntent();
        mSelectedItem = myIntent.getIntExtra("selectedItem",0);

        setContentView(R.layout.activity_item_library);

        TextView selectedItemName = findViewById(R.id.selected_item_id);
        selectedItemName.setText(String.valueOf(getResources().getString(mSelectedItem)));

        final ArrayList<Item> selectedItemList = new ArrayList<>();
        if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_albums))){
            for (int i=1; i<=LIST_ITEM_COUNT; i++){
                selectedItemList.add(new Item(makeSingular(getResources().getString(mSelectedItem)) + " " + i,
                        makeSingular(getResources().getString(R.string.library_artists)) + " " + i, R.drawable.ic_album_black_24dp));
            }
        }else if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_artists))){
            for (int i=1; i<=LIST_ITEM_COUNT; i++){
                selectedItemList.add(new Item(makeSingular(getResources().getString(mSelectedItem)) + " " + i,
                        R.drawable.ic_people_black_24dp));
            }
        }else if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_songs))){
            for (int i=1; i<=LIST_ITEM_COUNT; i++){
                selectedItemList.add(new Item(getResources().getString(R.string.song_title) + " " + i, makeSingular(getResources().getString(R.string.library_artists)) + " " + i));
            }
        }
        ListView listView = findViewById(R.id.library_selected_item_list);
        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), selectedItemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(LibraryItemActivity.this, ItemPlayActivity.class);
                myIntent.putExtra("selectedItem",mSelectedItem);
                startActivityForResult(myIntent, ITEM_PLAY_ACTIVITY_REQUEST_CODE);
            }
        });

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
