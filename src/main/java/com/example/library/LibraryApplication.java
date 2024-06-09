package com.example.library;

import java.util.Date;
import java.util.List;

import com.example.library.models.Book;
import com.example.library.models.CD;
import com.example.library.models.Genre;
import com.example.library.models.Library;
import com.example.library.models.LibraryItem;
import com.example.library.models.Periodicals;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		Library library = new Library();

		// creating items
		LibraryItem book = new Book("The Great Gatsby", new Date(), "F. Scott Fitzgerald", 180, Genre.Romance);
		LibraryItem cd = new CD("Alice in Wonderland", "Bunny", 8, Genre.Fantasy);
		LibraryItem periodicals = new Periodicals("Mango", "pineapple", 2, 1);

		library.addItem(periodicals);
		library.addItem(book);
		library.addItem(cd);
		{
			List<LibraryItem> items = library.getItems();
			for (LibraryItem item : items) {
				// borrowing item
				item.borrowItem();
				// returning item
				item.returnItem();
			}
		}

		library.removeItem(book);

		{
			List<LibraryItem> items = library.getItems();
			for (LibraryItem item : items) {
				// borrowing item
				item.borrowItem();
				// returning item
				item.returnItem();
			}
		}
		// SpringApplication.run(LibraryApplication.class, args);
	}

}
