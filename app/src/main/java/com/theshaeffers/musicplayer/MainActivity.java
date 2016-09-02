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

        //OnclickListener for Artists Button
        //This should make calls to a Content Resolver placed in a ListView
        TextView artistView = (TextView) findViewById(R.id.artist_textview);
        artistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ArtistActivity.class));
            }
        });

        //OnclickListener for Songs Button
        //This should make calls to a Content Resolver placed in a ListView
        TextView songsView = (TextView) findViewById(R.id.songs_textview);
        songsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SongsActivity.class));
            }
        });

        //OnclickListener for Playlists Button
        //This should look to stored playlists data and placed in a ListView
        TextView playlistsView = (TextView) findViewById(R.id.playlists_textview);
        playlistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlaylistActivity.class));
            }
        });

        //OnclickListener for Search Button
        //This should make calls to a Content Resolver placed in a ListView
        TextView searchView = (TextView) findViewById(R.id.search_textview);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView1 = (TextView) findViewById(R.id.recent_example_1);
        recentView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView2 = (TextView) findViewById(R.id.recent_example_2);
        recentView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView3 = (TextView) findViewById(R.id.recent_example_3);
        recentView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView4 = (TextView) findViewById(R.id.recent_example_4);
        recentView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView5 = (TextView) findViewById(R.id.recent_example_5);
        recentView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView6 = (TextView) findViewById(R.id.recent_example_6);
        recentView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        //OnclickListener for recent activity list item
        //sets activity to PlayActivity
        //ideally this would be generated from previously stored listen actions
        TextView recentView7 = (TextView) findViewById(R.id.recent_example_7);
        recentView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });


    }
}
