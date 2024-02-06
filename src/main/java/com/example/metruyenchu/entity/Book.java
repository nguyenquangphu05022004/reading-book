package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "books")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name_vn", columnDefinition = "NVARCHAR(150)")
    private String bookNameVn;

    @Column(name = "book_name_en", columnDefinition = "VARCHAR(150)")
    private String bookNameEn;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    private String thumbnail;

    @OneToMany(mappedBy = "book")
    private Set<Chapter> chapters = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "book")
    private Set<Notification> notifications = new HashSet<>();

   @ManyToMany
   @JoinTable(name = "book_category", joinColumns = @JoinColumn(name = "book_id"),
   inverseJoinColumns = @JoinColumn(name =  "category_id"))
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "book")
    private List<Evaluation> evaluations = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<Comment> comments;
}
