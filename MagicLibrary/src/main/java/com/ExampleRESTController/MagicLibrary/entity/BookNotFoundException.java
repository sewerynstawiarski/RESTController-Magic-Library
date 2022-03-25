package com.ExampleRESTController.MagicLibrary.entity;

import jdk.jshell.spi.ExecutionControl;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super ("Seems that the book: " + id + " magically disapeared O.o");
    }

}
