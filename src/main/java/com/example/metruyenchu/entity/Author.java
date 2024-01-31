package com.example.metruyenchu.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    private Long id;

    private String fullNameVN;

    private String fullNameEN;

    @OneToMany
    @JoinColumn(name = "book_id")
    private Set<Book> bookList;
}
