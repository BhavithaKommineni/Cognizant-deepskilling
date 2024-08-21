package com.example.bookstoreapi7.repository;

import com.example.bookstoreapi7.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
