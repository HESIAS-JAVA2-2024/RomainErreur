package org.example.repositories;

import org.example.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long>{
    
    List<Book> findByName(String name);
    
}
