

package com.library.LibraryManagement5;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the bookService bean to add and get books
        bookService.addBook("Spring Framework Essentials");
        bookService.getBook("Spring Framework Essentials");
    }
}
