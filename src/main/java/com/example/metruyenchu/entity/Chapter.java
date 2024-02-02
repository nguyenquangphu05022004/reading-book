package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chapter")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chapterName;

    private Integer numberOfChapter;

    private String chapterContent;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
