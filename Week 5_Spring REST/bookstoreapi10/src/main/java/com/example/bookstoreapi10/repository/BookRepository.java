package com.example.bookstoreapi10.repository;

import com.example.bookstoreapi10.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
