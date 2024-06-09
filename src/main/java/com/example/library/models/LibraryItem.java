package com.example.library.models;

import java.util.Date;

public class LibraryItem {
    String title;
    Date listing_date;
    boolean is_borrowed;

    public LibraryItem(String title, Date listing_date) {
        this.title = title;
        this.listing_date = listing_date;
        this.is_borrowed = false;
    }

    public LibraryItem(String title) {
        this.title = title;
        this.listing_date = new Date();
        this.is_borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public Date getListing_date() {
        return listing_date;
    }

    public void printDescription() {
        System.out.println("Title: " + title);
        System.out.println("Listing Date: " + listing_date);
    }

    public void borrowItem() {
        this.printDescription();

        if (this.is_borrowed) {
            System.err.println("Item already borrowed!\n");
        } else {
            this.is_borrowed = true;
            System.out.println("Item borrowed!\n");
        }
    }

    public void returnItem() {
        this.printDescription();

        if (this.is_borrowed) {
            this.is_borrowed = false;
            System.out.println("Item returned to library!\n");
        } else {
            System.err.println("Item was never borrowed\n");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LibraryItem other = (LibraryItem) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }    
}
