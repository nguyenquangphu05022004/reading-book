package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Category;
import com.example.metruyenchu.entity.Chapter;
import com.example.metruyenchu.entity.Evaluation;
import com.example.metruyenchu.entity.Notification;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    private String bookName;

    private String shortDescription;

    private String thumbnail;

    private Set<ChapterDto> chapters = new HashSet<>();

    private NotificationDto notification;

    private Set<CategoryDto> categories = new HashSet<>();

    private List<EvaluationDto> evaluations = new ArrayList<>();
}
