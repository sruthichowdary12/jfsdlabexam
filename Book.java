package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bookid")
  private int bookId;
  
  @Column(name = "title", nullable = false, length = 100)
  private String title;
  
  @Column(name = "author", nullable = false, length = 50)
  private String author;
  
  @Column(name = "genre", nullable = false, length = 30)
  private String genre;
  
  @Column(name = "price", nullable = false)
  private double price;
  
  @Column(name = "published_year", nullable = false)
  private int publishedYear;
  
  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(int publishedYear) {
    this.publishedYear = publishedYear;
  }
}
