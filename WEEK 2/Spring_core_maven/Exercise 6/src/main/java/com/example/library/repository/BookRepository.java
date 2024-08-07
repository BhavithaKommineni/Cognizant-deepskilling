package com.example.library.repository;

public class BookRepository {
    // Repository methods for accessing the database
    public void saveBook(String bookTitle) {
        // Save book to database logic
        System.out.println("Book \"" + bookTitle + "\" saved to the database.");
    }

    public void findBook(String bookTitle) {
        // Find book logic
        System.out.println("Finding book: " + bookTitle);
    }
}
