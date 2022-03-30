package com.ExampleRESTController.MagicLibrary.Entity;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private LocalDate printDate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book", fetch = FetchType.LAZY)
    BookIsAvailable isAvailable;


    public Book(String title, String author, LocalDate printDate, BookIsAvailable isAvailable) {
        this.title = title;
        this.author = author;
        this.printDate = printDate;
        this.isAvailable = isAvailable;
    }
}
