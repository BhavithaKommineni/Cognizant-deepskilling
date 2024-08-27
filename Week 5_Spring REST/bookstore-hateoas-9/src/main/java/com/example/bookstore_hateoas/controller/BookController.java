package com.example.bookstore_hateoas.controller;

import com.example.bookstore_hateoas.model.Book;
import com.example.bookstore_hateoas.resource.BookResource;
import com.example.bookstore_hateoas.service.BookService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public EntityModel<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return new BookResource(book);
    }

    @GetMapping
    public CollectionModel<EntityModel<Book>> getAllBooks() {
        List<Book> books = bookService.findAll();
        List<EntityModel<Book>> bookResources = books.stream()
            .map(BookResource::new)
            .collect(Collectors.toList());

        return CollectionModel.of(bookResources,
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks()).withSelfRel());
    }
}
