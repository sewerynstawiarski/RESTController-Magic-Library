package com.ExampleRESTController.MagicLibrary.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private LocalDate printDate;
    private boolean isAvailable;


    public Book() {
    }

    public Book(String title, String author, LocalDate printDate, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.printDate = printDate;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPrintDate() {
        return printDate;
    }

    public void setPrintDate(LocalDate printDate) {
        this.printDate = printDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", printDate=" + printDate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
