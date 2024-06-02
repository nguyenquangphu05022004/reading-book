package com.example.metruyenchu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_view_categories")
@Builder
public class BookViewCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "nvarchar(50)")
    private String name;
    @OneToMany(mappedBy = "bookViewCategory")
    private List<View> views;

}
