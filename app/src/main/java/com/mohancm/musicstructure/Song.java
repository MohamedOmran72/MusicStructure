package com.mohancm.musicstructure;

public class Song {

    private String Title;
    private String Author;
    private int ImageId;

    public Song(String title, String author, int imageId) {
        Title = title;
        Author = author;
        ImageId = imageId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
