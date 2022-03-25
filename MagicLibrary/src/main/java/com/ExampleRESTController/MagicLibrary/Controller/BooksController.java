package com.ExampleRESTController.MagicLibrary.Controller;



import com.ExampleRESTController.MagicLibrary.entity.Book;
import com.ExampleRESTController.MagicLibrary.entity.BookNotFoundException;
import com.ExampleRESTController.MagicLibrary.repository.BooksRepository;
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
    BooksRepository booksRepository;

    @PostMapping ("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        try {
            return new ResponseEntity<Book>(booksRepository.save(book), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PatchMapping("/books")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        try {
            return new ResponseEntity<Book>(booksRepository.save(book), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks(){
           return booksRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> findBookById(@PathVariable ("id") int id ) {
        return Optional.ofNullable(booksRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id)));
    }
    @GetMapping("/books/check/{id}")
    public boolean doesBookExistByID(@PathVariable ("id") int id ) {
        return booksRepository.existsById(id);
    }
    @GetMapping("/books/of/{author}")
    public List<Book> findByAuthor(@PathVariable("author") String author) {
        return booksRepository.findByAuthor(author);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBookByID (@PathVariable("id") int id) {
        booksRepository.deleteById(id);
    }
}
