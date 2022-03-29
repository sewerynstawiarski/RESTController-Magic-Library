package com.ExampleRESTController.MagicLibrary.BookDTO;


import com.ExampleRESTController.MagicLibrary.Entity.Book;
import com.ExampleRESTController.MagicLibrary.Entity.BookIsAvailable;
import com.ExampleRESTController.MagicLibrary.Entity.BookNotFoundException;
import com.ExampleRESTController.MagicLibrary.Repository.BookIsAvailableRepository;
import com.ExampleRESTController.MagicLibrary.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BookDTO {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    BookIsAvailableRepository bookIsAvailableRepository;

    public Book addBook(Book book){
            return booksRepository.save(book);
    }
    public BookIsAvailable addBookIsAvailable(BookIsAvailable bookIsAvailable){
        return bookIsAvailableRepository.save(bookIsAvailable);
    }
    public Book updateBook(Book book){
            return booksRepository.save(book);
    }
    public Iterable<Book> getBooks(){
        return booksRepository.findAll();
    }

    public Book findBookById(int id) {
        return booksRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }
    public boolean doesBookExistByID(int id ) {
        return booksRepository.existsById(id);
    }
    public List<Book> findByAuthor(String author) {
        return booksRepository.findByAuthor(author);
    }
    public void deleteBookByID (int id) {
        booksRepository.deleteById(id);
    }
}

