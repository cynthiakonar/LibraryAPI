package com.example.library.models;

import java.util.Date;

public class Book extends LibraryItem {
    String author;
    int pages;
    Genre genre;

    public Book(String title, Date listing_date, String author, int pages, Genre genre) {
        super(title, listing_date);
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public Book(String title, String author, int pages, Genre genre) {
        super(title);
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void printDescription() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Listing Date: " + listing_date);
    }

}
