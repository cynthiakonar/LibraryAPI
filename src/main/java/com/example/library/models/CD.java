package com.example.library.models;

import java.util.Date;

public class CD extends LibraryItem {
    String artist;
    int tracks;
    Genre genre;

    public CD(String title, String artist, int tracks, Genre genre) {
        super(title);
        this.artist = artist;
        this.tracks = tracks;
        this.genre = genre;
    }

    public CD(String title, Date listing_date, String artist, int tracks, Genre genre) {
        super(title, listing_date);
        this.artist = artist;
        this.tracks = tracks;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }

    public Genre getGenre() {
        return genre;
    }

    public void printDescription() {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Tracks: " + this.tracks);
        System.out.println("Genre: " + this.genre);
        System.out.println("Listing Date: " + this.listing_date);
    }
}
