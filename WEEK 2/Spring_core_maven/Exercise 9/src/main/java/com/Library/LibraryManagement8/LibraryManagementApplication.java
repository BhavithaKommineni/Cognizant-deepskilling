package com.Library.LibraryManagement8;

import com.Library.LibraryManagement8.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            // Get the BookService bean
            BookService bookService = context.getBean(BookService.class);
            // Use the bookService bean
            bookService.printBookService();
        }
    }
}
