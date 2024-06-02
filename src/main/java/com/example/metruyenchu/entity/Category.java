package com.example.metruyenchu.entity;

import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.CategoryDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "NVARCHAR(100)")
    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;

}
