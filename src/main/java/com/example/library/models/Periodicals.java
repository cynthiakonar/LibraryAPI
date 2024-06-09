package com.example.library.models;

import java.util.Date;

public class Periodicals extends LibraryItem {
    String title;
    String publisher;
    int issue_number;
    int volume_number;

    public Periodicals(String title, String publisher, int issue_number, int volume_number) {
        super(title);
        this.title = title;
        this.publisher = publisher;
        this.issue_number = issue_number;
        this.volume_number = volume_number;
    }

    public Periodicals(String title, Date listing_date, String publisher, int issue_number, int volume_number) {
        super(title, listing_date);
        this.title = title;
        this.publisher = publisher;
        this.issue_number = issue_number;
        this.volume_number = volume_number;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getIssueNumber() {
        return issue_number;
    }

    public int getVolumeNumber() {
        return volume_number;
    }

    @Override
    public void borrowItem() {
        System.err.println("Periodicals cannot be borrowed!\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Periodicals other = (Periodicals) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (issue_number != other.issue_number)
            return false;
        if (volume_number != other.volume_number)
            return false;
        return true;
    }

    public void printDescription() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue Number: " + issue_number);
        System.out.println("Volume Number: " + volume_number);
    }
}
