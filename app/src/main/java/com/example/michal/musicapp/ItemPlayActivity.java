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

        final Button playButton = findViewById(R.id.button_play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast playToast = Toast.makeText(ItemPlayActivity.this, "A song is playing!", Toast.LENGTH_SHORT );
                playToast.setGravity(Gravity.CENTER,0,0);
                playToast.show();

            }
        });



    }
}
