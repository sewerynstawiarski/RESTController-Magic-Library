package com.ExampleRESTController.MagicLibrary;


import com.ExampleRESTController.MagicLibrary.entity.Book;
import com.ExampleRESTController.MagicLibrary.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

//@Component
public class StartPopulation {
    @Autowired
    BooksRepository booksRepository;


    public StartPopulation(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void population() {
        LocalDate localDate1 = LocalDate.of(1991, 02, 9);
        Book book1 = new Book("Harry_Potter", "J.K.Rowling", localDate1,true);
        booksRepository.save(book1);
        LocalDate localDate2 = LocalDate.of(1992, 03, 8);
        Book book2 = new Book("Unfinished_Tales", "Tolkien", localDate2,true);
        booksRepository.save(book2);
        LocalDate localDate3 = LocalDate.of(1993, 04, 7);
        Book book3 = new Book("The_Lord_of_the_Ice_Garden", "Jarosław_Grzędowicz", localDate3,true);
        booksRepository.save(book3);
    }
}
