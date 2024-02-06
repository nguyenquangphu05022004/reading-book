package com.example.metruyenchu.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class BookDto {
    private Long id;
    private String bookNameVn;
    private String bookNameEn;
    private String shortDescription;

    private String thumbnail;

    private AuthorDto authorDto;

    private Set<ChapterDto> chapters = new HashSet<>();

    private NotificationDto notification;

    private Set<CategoryDto> categories = new HashSet<>();

    private List<EvaluationDto> evaluations = new ArrayList<>();

    private List<CommentDto> commentDtos;
}
