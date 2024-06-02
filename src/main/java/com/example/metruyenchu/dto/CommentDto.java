package com.example.metruyenchu.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class CommentDto {
    private Long id;
    private String commentContent;
    private Integer numberLikeOfComment;
    private UserDto userDto;
    private BookDto bookDto;
    private EvaluationDto evaluationDto;
}
