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

        //OnclickListener for first listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView1 = (TextView) findViewById(R.id.artists_list1);
        artistView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        //OnclickListener for 2nd listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView2 = (TextView) findViewById(R.id.artists_list2);
        artistView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        //OnclickListener for 3rd listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView3 = (TextView) findViewById(R.id.artist_list3);
        artistView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });


        //OnclickListener for 4th listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView4 = (TextView) findViewById(R.id.artist_list4);
        artistView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });


        //OnclickListener for 5th listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView5 = (TextView) findViewById(R.id.artist_list5);
        artistView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });

        //OnclickListener for 6th listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView6 = (TextView) findViewById(R.id.artist_list6);
        artistView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });


        //OnclickListener for 7th listed item
        //This should be created with a Content Resolver and ListView
        TextView artistView7 = (TextView) findViewById(R.id.artist_list7);
        artistView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistActivity.this, SongsActivity.class));
            }
        });
    }
}
