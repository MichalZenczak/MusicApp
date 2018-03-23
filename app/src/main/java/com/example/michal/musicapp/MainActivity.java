package com.example.michal.musicapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

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
                        android.support.v4.app.Fragment selectedFragment = null;
                        switch (item.getItemId()){
                            case R.id.action_library:
                                selectedFragment = new LibraryFragment();
                                break;
                            case R.id.action_search:
                                selectedFragment = new SearchFragment();
                                break;
                            case R.id.action_favorites:
                                selectedFragment = new FavoritesFragment();
                                break;
                        }
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.frame_layout, selectedFragment).commit();
                        return false;
                    }
                });
        bottomNavigationView.setSelectedItemId(R.id.action_library);
    }
}
