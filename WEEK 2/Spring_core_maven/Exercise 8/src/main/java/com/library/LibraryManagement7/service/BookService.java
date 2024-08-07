package com.library.LibraryManagement7.service;

import com.library.LibraryManagement7.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Constructor for constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookService() {
        System.out.println("BookService is working...");
        bookRepository.printBookRepository();
    }
}
