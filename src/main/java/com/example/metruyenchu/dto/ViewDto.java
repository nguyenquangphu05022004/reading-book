package com.example.metruyenchu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewDto {

    private Long id;
    private Integer viewsByDay;
    private Integer viewsByMonth;
    private Integer viewsByWeek;
    private Integer viewsTotal;
    private BookViewCategoryDto bookViewCategoryDto;
    private BookViewDto bookViewDto;
}
