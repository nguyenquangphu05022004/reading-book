package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class EvaluationDto {
    private Long id;
    private BookDto bookDto;
    private CommentDto commentDto;
    private float personOfCharacter;
    private float plotContent;
    private float worldLayout;

}
