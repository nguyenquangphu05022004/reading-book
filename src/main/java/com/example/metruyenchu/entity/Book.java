package com.example.metruyenchu.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "books")
public class Book {
    @Id
    private Long id;
    private String bookName;

    private String shortDescription;

    private String thumbnail;

    @OneToMany(mappedBy = "book")
    private Set<Chapter> chapters = new HashSet<>();

    @OneToOne
    private Notification notification;

    @OneToMany(mappedBy = "book")
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "book")
    private List<Evaluation> evaluations = new ArrayList<>();


}
