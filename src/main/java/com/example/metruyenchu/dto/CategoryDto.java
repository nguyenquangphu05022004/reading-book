package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Book;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class CategoryDto {
    private Long id;
    private String categoryName;
    private Set<BookDto> bookDtos;
}
