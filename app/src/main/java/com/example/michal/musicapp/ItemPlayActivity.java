package com.example.michal.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ItemPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_play);

        Button playButton = findViewById(R.id.button_play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast playToast = Toast.makeText(ItemPlayActivity.this, getResources().getString(R.string.play_toast), Toast.LENGTH_SHORT );
                playToast.setGravity(Gravity.CENTER,0,0);
                playToast.show();

            }
        });

        Button stopButton = findViewById(R.id.button_stop);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast stopToast = Toast.makeText(ItemPlayActivity.this, getResources().getString(R.string.stop_toast),Toast.LENGTH_SHORT );
                stopToast.setGravity(Gravity.CENTER,0,0);
                stopToast.show();
            }
        });

        Button nextButton = findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast nextToast = Toast.makeText(ItemPlayActivity.this, getResources().getString(R.string.next_toast),Toast.LENGTH_SHORT);
                nextToast.setGravity(Gravity.CENTER,0,0);
                nextToast.show();
            }
        });

        Button previousButton = findViewById(R.id.button_previous);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast previousToast = Toast.makeText(ItemPlayActivity.this, getResources().getString(R.string.previous_toast), Toast.LENGTH_SHORT);
                previousToast.setGravity(Gravity.CENTER,0,0);
                previousToast.show();
            }
        });
    }
}
