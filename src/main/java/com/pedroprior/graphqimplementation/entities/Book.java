package com.pedroprior.graphqimplementation.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String publisher;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book(String title, String publisher, Author author) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }


    public Book() {

    }
}
