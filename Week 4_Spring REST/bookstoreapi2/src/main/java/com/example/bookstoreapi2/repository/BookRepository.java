package com.example.bookstoreapi2.repository;

import com.example.bookstoreapi2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
