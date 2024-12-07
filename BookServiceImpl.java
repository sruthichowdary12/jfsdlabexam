package com.klef.jfsd.exam.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepository repository;

    @Override
    public String addBook(Book b) 
    {
        repository.save(b);
        return "Book Added Successfully";
    }

    @Override
    public String updateBook(Book b) 
    {
        Optional<Book> obj = repository.findById(b.getBookId());
        String msg = null;
        
        if (obj.isPresent()) 
        {
            Book book = obj.get();
            // Update operation
            book.setTitle(b.getTitle());
            book.setAuthor(b.getAuthor());
            book.setGenre(b.getGenre());
            book.setPrice(b.getPrice());
            book.setPublishedYear(b.getPublishedYear());
            
            repository.save(book);
            msg = "Book Updated Successfully";
        } 
        else 
        {
            msg = "Book ID Not Found";
        }
        return msg;
    }

    @Override
    public List<Book> displayAllBooks() 
    {
        return (List<Book>) repository.findAll();
    }

    @Override
    public Book displayBookByID(int bookId) 
    {
        return repository.findById(bookId).orElse(null);
    }
}
