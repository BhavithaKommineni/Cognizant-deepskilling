package com.example.bookstoreapi7.repository;

import com.example.bookstoreapi7.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
