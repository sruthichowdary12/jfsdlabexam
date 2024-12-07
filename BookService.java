package com.klef.jfsd.exam.service;

import java.util.List;
import com.klef.jfsd.exam.model.Book;

public interface BookService 
{
    public String addBook(Book b);
    public String updateBook(Book b);
    public List<Book> displayAllBooks();
    public Book displayBookByID(int bookId);
}
