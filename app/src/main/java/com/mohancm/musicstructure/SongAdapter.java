package com.mohancm.musicstructure;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {

    private Context mContext;
    private List<Song> mSongs;

    public SongAdapter(Context mContext, List<Song> mSongs) {
        this.mContext = mContext;
        this.mSongs = mSongs;
    }

    @NonNull
    @Override
    public SongAdapter.SongHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
        view = mLayoutInflater.inflate(R.layout.release_items,viewGroup,false);
        return new SongHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.SongHolder songHolder,final int i) {

        songHolder.song_title.setText(mSongs.get(i).getTitle());
        songHolder.song_author.setText(mSongs.get(i).getAuthor());
        songHolder.song_image.setImageResource(mSongs.get(i).getImageId());
        songHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing data
                Intent intent = new Intent(mContext,MusicPlaying.class);
                intent.putExtra("Title",mSongs.get(i).getTitle());
                intent.putExtra("Author",mSongs.get(i).getAuthor());
                intent.putExtra("Thumbnail",mSongs.get(i).getImageId());

                //Initaiting Activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    public class SongHolder extends RecyclerView.ViewHolder {

        TextView song_title;
        TextView song_author;
        ImageView song_image;
        CardView cardView;

        public SongHolder(View itemView){
            super(itemView);

            song_title = itemView.findViewById(R.id.song_title_id);
            song_author = itemView.findViewById(R.id.song_author_id);
            song_image = itemView.findViewById(R.id.song_image_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
