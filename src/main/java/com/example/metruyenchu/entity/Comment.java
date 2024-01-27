package com.example.metruyenchu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String commentContent;
    private Integer numberLikeOfComment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userComment;
}
