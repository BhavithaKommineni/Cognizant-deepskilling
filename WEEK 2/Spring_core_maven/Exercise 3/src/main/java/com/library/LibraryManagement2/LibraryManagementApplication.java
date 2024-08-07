package com.library.LibraryManagement2;

//LibraryManagementApplication.java


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
 public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     BookService bookService = (BookService) context.getBean("bookService");
     bookService.performSomeOperation();
     ((ClassPathXmlApplicationContext) context).close();
 }
}
