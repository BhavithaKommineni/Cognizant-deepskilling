package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for bookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Business logic methods
    public void addBook(String bookTitle) {
        // Business logic before saving the book
        System.out.println("Adding book: " + bookTitle);
        bookRepository.saveBook(bookTitle);
    }

    public void getBook(String bookTitle) {
        // Business logic for finding a book
        bookRepository.findBook(bookTitle);
    }
}
