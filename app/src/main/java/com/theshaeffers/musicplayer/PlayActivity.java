package com.theshaeffers.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //OnclickListener for play button
        //diplays toast message
        //TODO test MusicPlayer API
        ImageView playButton = (ImageView) findViewById(R.id.play_imageview);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Uses MusicPlayer API to play selection", Toast.LENGTH_SHORT).show();
            }
        });

        //OnclickListener for previous button
        //diplays toast message
        //TODO test MusicPlayer API
        ImageView previousButton = (ImageView) findViewById(R.id.previous_imageview);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Uses MusicPlayer API to navigate", Toast.LENGTH_SHORT).show();
            }
        });

        //OnclickListener for next button
        //diplays toast message
        //TODO test MusicPlayer API
        ImageView nextButton = (ImageView) findViewById(R.id.next_imageview);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Uses MusicPlayer API to navigate", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
