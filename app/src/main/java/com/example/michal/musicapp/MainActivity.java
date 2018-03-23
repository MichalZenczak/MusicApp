package com.example.michal.musicapp;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.action_library:
                                // w kazdym case wywolac nowy intent do new activity


                                final ArrayList<String> artists = new ArrayList<>();
                                for (int i = 1; i<=100; i++){
                                    artists.add("Artist " + i);
                                }
                                final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1 ,artists);
                                final ListView listView = findViewById(R.id.list);
                                listView.setAdapter(adapter);

                            case R.id.action_search:

                            case R.id.action_favorites:
                        }
                        return false;
                    }
                });
    }
}
