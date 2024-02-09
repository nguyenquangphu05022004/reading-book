package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "read_books")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private  Book book;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

}
