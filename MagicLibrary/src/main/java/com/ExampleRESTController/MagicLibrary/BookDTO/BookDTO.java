package com.ExampleRESTController.MagicLibrary.BookDTO;


import com.ExampleRESTController.MagicLibrary.Entity.Book;
import com.ExampleRESTController.MagicLibrary.Entity.BookIsAvailable;
import com.ExampleRESTController.MagicLibrary.Entity.BookNotFoundException;
import com.ExampleRESTController.MagicLibrary.Repository.BookIsAvailableRepo;
import com.ExampleRESTController.MagicLibrary.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookDTO {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    BookIsAvailableRepo bookIsAvailableRepo;

    public Book addBook(Book book){
            return booksRepository.save(book);
    }
    public BookIsAvailable addBookIsAvailable(BookIsAvailable bookIsAvailable){
        return bookIsAvailableRepo.save(bookIsAvailable);
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

