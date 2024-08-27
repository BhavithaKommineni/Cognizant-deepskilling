package com.example.bookstore_hateoas.resource;

import com.example.bookstore_hateoas.model.Book;
import com.example.bookstore_hateoas.controller.BookController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class BookResource extends EntityModel<Book> {

    public BookResource(Book book) {
        super(book);
        add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel());
        add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks()).withRel("all-books"));
    }
}
