package com.book.systemmanagementwithmongodb.repository;

import com.book.systemmanagementwithmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,String>{
}
