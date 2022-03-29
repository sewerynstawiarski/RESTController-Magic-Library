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
public class BookIsAvailable {
    @Id
    @GeneratedValue
    private int id;
    private boolean isAvailable;


    public BookIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}