package com.example.bookstoreapi4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerFormController {

    @PostMapping("/register-form")
    public ResponseEntity<String> registerCustomerForm(@RequestParam Map<String, String> formData) {
        // Extract form data
        String name = formData.get("name");
        String email = formData.get("email");
        String address = formData.get("address");

        // Simulate saving the form data to the database
        return new ResponseEntity<>("Customer " + name + " registered successfully!", HttpStatus.CREATED);
    }
}
