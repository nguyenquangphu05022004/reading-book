package com.example.metruyenchu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
