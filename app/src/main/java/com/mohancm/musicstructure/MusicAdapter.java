package com.mohancm.musicstructure;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private ArrayList<Music> musicItems;
    private Context mContext;

    public MusicAdapter(ArrayList<Music> musicItems, Context mContext) {
        this.musicItems = musicItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.music_playlist_items,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Music music = musicItems.get(i);
        myViewHolder.musicImageView.setImageResource(music.getMusicImage());
        myViewHolder.musicNameTextView.setText(music.getMusicName());
        myViewHolder.musicAuthorTextView.setText(music.getMusicAuthorName());

    }

    @Override
    public int getItemCount() {
        return musicItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView musicImageView;
        TextView musicNameTextView;
        TextView musicAuthorTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            musicImageView = itemView.findViewById(R.id.music_image);
            musicNameTextView = itemView.findViewById(R.id.music_name);
            musicAuthorTextView = itemView.findViewById(R.id.music_author_name);
        }
    }
}
