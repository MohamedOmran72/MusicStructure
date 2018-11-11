package com.mohancm.musicstructure;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MusicPlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playlist);

        final android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar_playlist);
        toolbar.setTitle(getResources().getString(R.string.music_library));
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setBackgroundColor(getColor(R.color.colorPrimaryDark));
        setSupportActionBar(toolbar);
        TabLayout tabLayout = findViewById(R.id.tablayout_playlist);

        // tabitems
        TabItem tabPlaylist = findViewById(R.id.tabPlaylist);
        TabItem tabStations = findViewById(R.id.tabStations);
        TabItem tabArtits = findViewById(R.id.tabArtists);
        TabItem tabAlbums = findViewById(R.id.tabAlbums);
        TabItem tabSongs = findViewById(R.id.tabSongs);

        ViewPager viewPager = findViewById(R.id.viewPager_playlist);
        PlaylistAdapter playlistAdapter = new PlaylistAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(playlistAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(MusicPlaylistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

//        ImageView musicImage = (ImageView) findViewById(R.id.music_image);
//
//        musicImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent playlistIntent = new Intent(MusicPlaylistActivity.this, MusicPlaying.class);
//                Toast.makeText(v.getContext(),"Playing music",Toast.LENGTH_SHORT).show();
//
//                startActivity(playlistIntent);
//
//            }
//        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1){
                    toolbar.setBackgroundColor(ContextCompat.getColor(MusicPlaylistActivity.this,R.color.colorPrimaryDark));
                } else if(tab.getPosition() == 2){
                    toolbar.setBackgroundColor(ContextCompat.getColor(MusicPlaylistActivity.this,R.color.colorPrimaryDark));
                } else if(tab.getPosition() == 3){
                    toolbar.setBackgroundColor(ContextCompat.getColor(MusicPlaylistActivity.this,R.color.colorPrimaryDark));
                } else if(tab.getPosition() == 4){
                    toolbar.setBackgroundColor(ContextCompat.getColor(MusicPlaylistActivity.this,R.color.colorPrimaryDark));
                } else {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MusicPlaylistActivity.this,R.color.colorPrimaryDark));
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
