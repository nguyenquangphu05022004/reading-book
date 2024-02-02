package com.example.metruyenchu.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class ChapterDto {
    private Long id;
    private String content;
    private BookDto bookDto;
    private int numberOfChapter;
    private String chapterName;
}
