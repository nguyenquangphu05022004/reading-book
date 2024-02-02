package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evalutions")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
