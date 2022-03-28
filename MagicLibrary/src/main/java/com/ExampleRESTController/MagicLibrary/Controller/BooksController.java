package com.ExampleRESTController.MagicLibrary.Controller;



import com.ExampleRESTController.MagicLibrary.BookDTO.BookDTO;
import com.ExampleRESTController.MagicLibrary.Entity.Book;
import com.ExampleRESTController.MagicLibrary.Entity.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
public class BooksController {

    @Autowired
    BookDTO bookDTO;

    @PostMapping ("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        try {
            return new ResponseEntity<>(bookDTO.addBook(book), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PatchMapping("/books")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        try {
            return new ResponseEntity<>(bookDTO.updateBook(book), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks(){
           return bookDTO.getBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> findBookById(@PathVariable ("id") int id ) {
        return Optional.ofNullable(bookDTO.findBookById(id));
    }
    @GetMapping("/books/check/{id}")
    public boolean doesBookExistByID(@PathVariable ("id") int id ) {
        return bookDTO.doesBookExistByID(id);
    }
    @GetMapping("/books/of/{author}")
    public List<Book> findByAuthor(@PathVariable("author") String author) {
        return bookDTO.findByAuthor(author);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBookByID (@PathVariable("id") int id) {
            bookDTO.deleteBookByID(id);
    }
}
