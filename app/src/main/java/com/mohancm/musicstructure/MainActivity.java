package com.mohancm.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_music_library:
                    Intent playIntent = new Intent(MainActivity.this,MusicPlaylistActivity.class);
                    startActivity(playIntent);
                    return true;
                case R.id.navigation_recents:
                    Intent recentIntent = new Intent(MainActivity.this,RecentsActivity.class);
                    startActivity(recentIntent);
                    return true;
                case R.id.navigation_new_releases:
                    Intent releasesIntent = new Intent(MainActivity.this, NewReleases.class);
                    startActivity(releasesIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
