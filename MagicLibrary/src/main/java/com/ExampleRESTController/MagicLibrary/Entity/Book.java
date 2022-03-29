package com.ExampleRESTController.MagicLibrary.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private LocalDate printDate;


    public Book(String title, String author, LocalDate printDate) {
        this.title = title;
        this.author = author;
        this.printDate = printDate;
    }
}
