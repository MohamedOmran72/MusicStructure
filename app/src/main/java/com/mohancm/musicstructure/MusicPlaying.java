package com.mohancm.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlaying extends AppCompatActivity {

    private TextView tvTitle, tvAuthor;
    private ImageView img;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playing);

        tvTitle = findViewById(R.id.title_tv);
        tvAuthor = findViewById(R.id.author_tv);
        img = findViewById(R.id.song_im);

        // recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Author = intent.getExtras().getString("Author");
        int Image = intent.getExtras().getInt("Thumbnail");

        //Setting Values
        tvTitle.setText(Title);
        tvAuthor.setText(Author);
        img.setImageResource(Image);

        imageButton = findViewById(R.id.image_back_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(MusicPlaying.this, NewReleases.class);
                startActivity(backIntent);
            }
        });
    }
}
