package com.example.metruyenchu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "evalutions")
public class Evaluation {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private float personOfCharacter;

    private float plotContent;

    private float worldLayout;

    private String evalutionContent;

}
