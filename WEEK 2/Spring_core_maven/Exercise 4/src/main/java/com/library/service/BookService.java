package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performSomeOperation() {
        // Example operation using bookRepository
        System.out.println("Performing some operation with bookRepository...");
        // Use bookRepository here if needed
    }
}
