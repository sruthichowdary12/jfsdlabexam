package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;

@RestController
@RequestMapping("book")
public class BookController
{
    @Autowired
    private BookService service;

    @GetMapping("/")
    public String home() {
        return "Spring Boot Rest API and JPA for Book Management";
    }

    @PostMapping("add")
    public String addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping("viewall")
    public List<Book> viewAllBooks() {
        return service.displayAllBooks();
    }

    @GetMapping("display")
    public Book displayBook(@RequestParam("id") int bookId) {
        return service.displayBookByID(bookId);
    }

    @PutMapping("update")
    public String updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }
}

