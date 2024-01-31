package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class ICategoryConvert implements GenericConvert<Category, CategoryDto> {
    @Override
    public Category toEntity(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto toDto(Category category) {
        return null;
    }

    @Override
    public Category toEntity(Category category, CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto toDto(CategoryDto categoryDto, Category category) {
        return null;
    }
}
