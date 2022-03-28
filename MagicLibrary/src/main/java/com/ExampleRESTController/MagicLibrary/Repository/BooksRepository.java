package com.ExampleRESTController.MagicLibrary.Repository;

import com.ExampleRESTController.MagicLibrary.Entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends CrudRepository <Book, Integer>{
    List<Book> findByAuthor(String author);
}
