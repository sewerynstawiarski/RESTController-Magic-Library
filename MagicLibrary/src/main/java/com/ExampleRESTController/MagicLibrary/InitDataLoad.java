package com.ExampleRESTController.MagicLibrary;


import com.ExampleRESTController.MagicLibrary.entity.Book;
import com.ExampleRESTController.MagicLibrary.repository.BooksRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class InitDataLoad {
    Logger logger = (Logger) LoggerFactory.getLogger(InitDataLoad.class);
    @Bean
    CommandLineRunner initData(BooksRepository booksRepository) {
        return args -> {
            LocalDate localDate1 = LocalDate.of(1991, 02, 9);
            logger.info("New book flies in: " + booksRepository.save(new Book("Harry_Potter", "J.K.Rowling", localDate1,true)));
            LocalDate localDate2 = LocalDate.of(1992, 03, 8);
            logger.info("New book flies in: " + booksRepository.save(new Book("Unfinished_Tales", "Tolkien", localDate2,true)));
            LocalDate localDate3 = LocalDate.of(1993, 04, 7);
            logger.info("New book flies in: " + booksRepository.save(new Book("The_Lord_of_the_Ice_Garden", "Jarosław_Grzędowicz", localDate3,true)));
        };
    }


}
