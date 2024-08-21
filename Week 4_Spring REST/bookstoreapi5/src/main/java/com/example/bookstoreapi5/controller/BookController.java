package com.example.bookstoreapi5.controller;

import com.example.bookstoreapi5.model.Book;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Customize response status
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        // Simulate saving the book (you can add service layer logic here)
        book.setId(1L); // Just a dummy ID for demonstration

        // Customize headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "BookCreated");

        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // Customize response status
    public ResponseEntity<Book> getBook(@PathVariable Long id) {
        // Simulate fetching the book (you can add service layer logic here)
        Book book = new Book();
        book.setId(id);
        book.setTitle("Sample Book");
        book.setAuthor("Author Name");
        book.setPrice(19.99);

        // Customize headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "BookFetched");

        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Customize response status
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        // Simulate deleting the book (you can add service layer logic here)

        // Customize headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "BookDeleted");

        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }
}
