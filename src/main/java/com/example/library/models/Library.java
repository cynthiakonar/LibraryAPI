package com.example.library.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<LibraryItem> items;

    public Library(List<LibraryItem> items) {
        this.items = items;
        System.out.println("Library created with " + items.size() + " items.");
    }

    public Library() {
        this.items = new ArrayList<LibraryItem>();
        System.out.println("Empty libary created! Get started by adding items!");
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        item.printDescription();
        System.out.println("Item added to library!\n");
    }

    public void removeItem(LibraryItem item) {
        this.items.remove(item);
        item.printDescription();
        System.out.println("Item removed from library!\n");
    }

    public void removeItem(int index) {
        assert index >= 0 && index < this.items.size();
        LibraryItem item = this.items.remove(index);
        item.printDescription();
        System.out.println("Item removed from library!\n");
    }

    public List<LibraryItem> getItems() {
        return this.items;
    }
}
