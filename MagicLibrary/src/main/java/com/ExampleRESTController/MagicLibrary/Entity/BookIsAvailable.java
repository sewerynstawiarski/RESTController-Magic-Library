package com.ExampleRESTController.MagicLibrary.Entity;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "BookIsAvailable")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "statusId")
public class BookIsAvailable{

    @Id
    @GeneratedValue
    private int statusId;

    @OneToOne(mappedBy = "isAvailable", cascade = CascadeType.ALL)
    Book book;

    private boolean isAvailable;


    public BookIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}






