package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.AuthorDto;
import com.example.metruyenchu.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class IAuthorConvert implements GenericConvert<Author, AuthorDto> {
    @Override
    public Author toEntity(AuthorDto authorDto) {
        return null;
    }

    @Override
    public AuthorDto toDto(Author author) {
        return null;
    }

    @Override
    public Author toEntity(Author author, AuthorDto authorDto) {
        return null;
    }

    @Override
    public AuthorDto toDto(AuthorDto authorDto, Author author) {
        return null;
    }
}
