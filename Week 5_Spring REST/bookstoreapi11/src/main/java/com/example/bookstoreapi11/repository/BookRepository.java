package com.example.bookstoreapi11.repository;

import com.example.bookstoreapi11.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
