package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentContent;
    private Integer numberLikeOfComment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userComment;
}
