package com.Library.LibraryManagement8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Library.LibraryManagement8.repository.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookService() {
        System.out.println("Book Service is working.");
    }
}
