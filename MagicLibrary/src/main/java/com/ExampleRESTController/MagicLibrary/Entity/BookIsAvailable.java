package com.ExampleRESTController.MagicLibrary.Entity;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@NoArgsConstructor
@Setter
@Getter
public class BookIsAvailable {
    @Id
    @GeneratedValue
    private int BookID;
    private boolean isAvailable;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BookID")
    Book book;

    public BookIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}



