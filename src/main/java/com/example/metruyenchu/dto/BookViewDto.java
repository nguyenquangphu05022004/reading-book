package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.BookViewCategory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookViewDto {
    private Long id;
    private LocalDateTime day;
    private LocalDateTime week;
    private LocalDateTime month;

    private BookDto bookDto;
    private List<ViewDto> viewDtos;
}
