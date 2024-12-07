package com.klef.jfsd.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>
{
	
  
}
