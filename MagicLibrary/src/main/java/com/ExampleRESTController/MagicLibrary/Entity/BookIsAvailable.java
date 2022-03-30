package com.ExampleRESTController.MagicLibrary.Entity;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "BookIsAvailable")
public class BookIsAvailable {
    @OneToOne(fetch = FetchType.LAZY)
    Book book;

    @Id
    @GeneratedValue
    private int ID;

    private boolean isAvailable;


    public BookIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}






