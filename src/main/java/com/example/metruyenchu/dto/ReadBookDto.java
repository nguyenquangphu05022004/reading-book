package com.example.metruyenchu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReadBookDto {
    private Long id;
    private BookDto bookDto;
    private UserDto userDto;
    private ChapterDto chapterDto;
}
