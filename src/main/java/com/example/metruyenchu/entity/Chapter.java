package com.example.metruyenchu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chapter")
public class Chapter {

    @Id
    private Long id;
    private String chapterName;

    private Integer numberOfChapter;

    private String chapterContent;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
