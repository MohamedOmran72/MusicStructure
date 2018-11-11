package com.mohancm.musicstructure;

public class Music {

    private String musicName;
    private String musicAuthorName;
    private int musicImage;

    public Music(String musicName, String musicAuthorName, int musicImage) {
        this.musicName = musicName;
        this.musicAuthorName = musicAuthorName;
        this.musicImage = musicImage;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getMusicAuthorName() {
        return musicAuthorName;
    }

    public int getMusicImage() {
        return musicImage;
    }
}
