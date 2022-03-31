package com.ExampleRESTController.MagicLibrary.Repository;

import com.ExampleRESTController.MagicLibrary.Entity.Book;
import com.ExampleRESTController.MagicLibrary.Entity.BookIsAvailable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends CrudRepository <Book, Integer>{
    List<Book> findByAuthor(String author);
}
