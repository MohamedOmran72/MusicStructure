package com.mohancm.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewReleases extends AppCompatActivity {

    List<Song> songList;
    RecyclerView recyclerView;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_releases);

        Toast.makeText(NewReleases.this, "Welcome to new releases", Toast.LENGTH_SHORT).show();

        songList = new ArrayList<Song>();
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));
        songList.add(new Song("All is well", "Some Artist",R.drawable.ic_music_circle));


        recyclerView = findViewById(R.id.recyclerview_nr);
        SongAdapter songAdapter = new SongAdapter(this,songList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(songAdapter);

        imageButton = (ImageButton) findViewById(R.id.release_back_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent releaseBackIntent = new Intent(NewReleases.this,MainActivity.class);
                startActivity(releaseBackIntent);
            }
        });
    }


}
