package com.example.bookstoreapi8.repository;

import com.example.bookstoreapi8.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
