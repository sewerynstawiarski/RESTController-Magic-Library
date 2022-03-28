package com.ExampleRESTController.MagicLibrary.Entity;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super ("Seems that the book: " + id + " magically disapeared O.o");
    }

}
