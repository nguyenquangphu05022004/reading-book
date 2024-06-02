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

    @Column(name = "full_name_vn", columnDefinition = "nvarchar(50)")
    private String fullNameVN;

    @OneToMany(mappedBy = "author")
    private Set<Book> bookList;
}
