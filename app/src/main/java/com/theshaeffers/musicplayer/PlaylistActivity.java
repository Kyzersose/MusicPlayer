package com.theshaeffers.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //OnclickListeners for fake lists of playlists
        //TODO check how to store data for app
        TextView playlistView1 = (TextView) findViewById(R.id.playlist_choice_view1);
        playlistView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView2 = (TextView) findViewById(R.id.playlist_choice_view2);
        playlistView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView3 = (TextView) findViewById(R.id.playlist_choice_view3);
        playlistView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView4 = (TextView) findViewById(R.id.playlist_choice_view4);
        playlistView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView5 = (TextView) findViewById(R.id.playlist_choice_view5);
        playlistView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView6 = (TextView) findViewById(R.id.playlist_choice_view6);
        playlistView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });

        TextView playlistView7 = (TextView) findViewById(R.id.playlist_choice_view7);
        playlistView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaylistActivity.this, SongsActivity.class));
            }
        });
    }
}
