package com.theshaeffers.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistView = (TextView) findViewById(R.id.artist_textview);
        artistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ArtistActivity.class));
            }
        });

        TextView songsView = (TextView) findViewById(R.id.songs_textview);
        songsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SongsActivity.class));
            }
        });

        TextView playlistsView = (TextView) findViewById(R.id.playlists_textview);
        playlistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlaylistActivity.class));
            }
        });

        TextView recentView = (TextView) findViewById(R.id.recent_textview);
        recentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });


    }
}
