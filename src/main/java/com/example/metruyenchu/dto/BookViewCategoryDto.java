package com.example.metruyenchu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookViewCategoryDto {
    private Long id;
    private String name;
    List<ViewDto> viewDtos;
}
