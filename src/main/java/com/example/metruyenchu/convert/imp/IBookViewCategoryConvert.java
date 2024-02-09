package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.BookViewCategoryDto;
import com.example.metruyenchu.entity.BookViewCategory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IBookViewCategoryConvert implements GenericConvert<BookViewCategory, BookViewCategoryDto> ,
        GenericConvertTw<BookViewCategory, BookViewCategoryDto> {
    @Override
    public BookViewCategory toEntity(BookViewCategoryDto bookViewCategoryDto) {
        return BookViewCategory.builder()
                .id(bookViewCategoryDto.getId())
                .name(bookViewCategoryDto.getName())
                .build();
    }

    @Override
    public BookViewCategoryDto toDto(BookViewCategory bookViewCategory) {
        return BookViewCategoryDto.builder()
                .id(bookViewCategory.getId())
                .name(bookViewCategory.getName())
                .build();
    }

    @Override
    public BookViewCategory toEntity(BookViewCategory bookViewCategory,
                                     BookViewCategoryDto bookViewCategoryDto) {
        return null;
    }

    @Override
    public BookViewCategoryDto toDto(BookViewCategoryDto bookViewCategoryDto,
                                     BookViewCategory bookViewCategory) {
        return null;
    }

    @Override
    public List<BookViewCategory> toEntity(List<BookViewCategoryDto> list) {
        return list.stream().map((dto) -> {
            return toEntity(dto);
        }).toList();
    }

    @Override
    public List<BookViewCategoryDto> toDto(List<BookViewCategory> list) {
        return null;
    }
}
