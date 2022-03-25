package com.ExampleRESTController.MagicLibrary.repository;

import com.ExampleRESTController.MagicLibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface BooksRepository extends CrudRepository <Book, Integer>{
    List<Book> findByAuthor(String author);
}
