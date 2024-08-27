package com.example.bookstoreapi8.repository;

import com.example.bookstoreapi8.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
