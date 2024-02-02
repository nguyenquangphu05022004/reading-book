package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullNameVN;

    private String fullNameEN;

    @OneToMany
    @JoinColumn(name = "book_id")
    private Set<Book> bookList;
}
