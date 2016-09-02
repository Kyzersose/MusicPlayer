package com.theshaeffers.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //OnclickListeners for fake song list
        //each changes to the PlayActivity
        //TODO research Content Resolver, Adapters, and ListView
        TextView songsView1 = (TextView) findViewById(R.id.song_choice_view1);
        songsView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView2 = (TextView) findViewById(R.id.song_choice_view2);
        songsView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView3 = (TextView) findViewById(R.id.song_choice_view3);
        songsView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView4 = (TextView) findViewById(R.id.song_choice_view4);
        songsView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView5 = (TextView) findViewById(R.id.song_choice_view5);
        songsView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView6 = (TextView) findViewById(R.id.song_choice_view6);
        songsView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });

        TextView songsView7 = (TextView) findViewById(R.id.song_choice_view7);
        songsView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SongsActivity.this, PlayActivity.class));
            }
        });
    }
}
