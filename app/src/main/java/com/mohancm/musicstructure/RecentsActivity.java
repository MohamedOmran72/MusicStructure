package com.mohancm.musicstructure;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecentsActivity extends AppCompatActivity {

    TextView mSongName;
    TextView mSongAuthorName;
    ImageView mSongImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recents);

        final android.support.v7.widget.Toolbar toolbarRecent = findViewById(R.id.toolbar_recents);
        toolbarRecent.setTitle(getResources().getString(R.string.title_recents));
        toolbarRecent.setNavigationIcon(R.drawable.ic_back_button);
        toolbarRecent.setBackgroundColor(getColor(R.color.colorPrimaryDark));
        setSupportActionBar(toolbarRecent);

        mSongName = findViewById(R.id.music_name);
        mSongAuthorName = findViewById(R.id.music_author_name);
        mSongImage = findViewById(R.id.music_image);

        ArrayList<Music> list = new ArrayList<>();
        for (int i=0; i<50; i++){
            list.add(new Music(getString(R.string.music_name),getString(R.string.music_author),R.drawable.ic_music_circle));
        }

        MusicAdapter mAdapter = new MusicAdapter(list,this);

        RecyclerView mRecyclerView = findViewById(R.id.rv_recents);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this ));
        mRecyclerView.setAdapter(mAdapter);

        toolbarRecent.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(RecentsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}