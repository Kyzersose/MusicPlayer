package com.theshaeffers.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView artistView1 = (TextView) findViewById(R.id.artists_list1);
        artistView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView2 = (TextView) findViewById(R.id.artists_list2);
        artistView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView3 = (TextView) findViewById(R.id.artist_list3);
        artistView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView4 = (TextView) findViewById(R.id.artist_list4);
        artistView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView5 = (TextView) findViewById(R.id.artist_list5);
        artistView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView6 = (TextView) findViewById(R.id.artist_list6);
        artistView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        TextView artistView7 = (TextView) findViewById(R.id.artist_list7);
        artistView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });
    }
}
