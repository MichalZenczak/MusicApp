package com.example.michal.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemPlayActivity extends AppCompatActivity {

    private int mSelectedItem;

    /**
     *This method is called when the Up Button is clicked. An intent is created with a RESULT_OK and
     *the current activity is finished.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent(ItemPlayActivity.this, LibraryItemActivity.class);
                myIntent.putExtra("selectedItem",mSelectedItem);
                setResult(RESULT_OK,myIntent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_play);

        Intent myIntent = getIntent();
        mSelectedItem = myIntent.getIntExtra("selectedItem",0);
        String text1 = myIntent.getStringExtra("text1");
        String text2 = myIntent.getStringExtra("text2");

        ImageView image = findViewById(R.id.activity_item_play_image);
        if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_albums))){
            image.setImageResource(R.drawable.ic_album_black_24dp);
        }else if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_artists))){
            image.setImageResource(R.drawable.ic_people_black_24dp);
        }else if (getResources().getString(mSelectedItem).equals(getResources().getString(R.string.library_songs))){
            image.setImageResource(R.drawable.ic_music_note_black_24dp);
        }
        TextView textView1 = findViewById(R.id.activity_item_play_text1);
        textView1.setText(text1);
        TextView textView2 = findViewById(R.id.activity_item_play_text2);
        textView2.setText(text2);

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
