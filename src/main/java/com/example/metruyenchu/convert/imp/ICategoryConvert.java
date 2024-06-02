package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.entity.Category;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ICategoryConvert implements GenericConvert<Category, CategoryDto>,
        GenericConvertTw<Category, CategoryDto> {
    @Override
    public Category toEntity(CategoryDto categoryDto) {
        Category category = Category.builder()
                .categoryName(categoryDto.getCategoryName())
                .id(categoryDto.getId())
                .build();
        return category;
    }

    @Override
    public CategoryDto toDto(Category category) {
        CategoryDto categoryDto = CategoryDto.builder()
                .categoryName(category.getCategoryName())
                .id(category.getId())
                .build();
        return categoryDto;
    }

    @Override
    public Category toEntity(Category category, CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto toDto(CategoryDto categoryDto, Category category) {
        return null;
    }


    @Override
    public List<Category> toEntity(List<CategoryDto> list) {
        List<Category> categories = list.stream().map(
                (dto) -> toEntity(dto)
        ).collect(Collectors.toList());
        return categories;
    }

    @Override
    public List<CategoryDto> toDto(List<Category> list) {
        List<CategoryDto> categoryDtos =  list.stream().map(
                (entity) -> toDto(entity)
        ).collect(Collectors.toList());
        return categoryDtos;
    }
}
