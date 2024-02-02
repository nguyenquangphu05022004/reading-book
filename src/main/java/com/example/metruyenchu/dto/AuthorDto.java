package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Book;
import lombok.*;

import java.util.Set;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class AuthorDto {
    private Long id;
    private String fullNameVN;

    private String fullNameEN;

    private Set<Book> bookList;
}
