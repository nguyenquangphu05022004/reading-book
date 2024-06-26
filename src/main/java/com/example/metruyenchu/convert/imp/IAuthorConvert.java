package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.AuthorDto;
import com.example.metruyenchu.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class IAuthorConvert implements GenericConvert<Author, AuthorDto> {
    @Override
    public Author toEntity(AuthorDto authorDto) {
        Author author = Author.builder()
                .fullNameVN(authorDto.getFullNameVN())
                .build();
        return author;
    }

    @Override
    public AuthorDto toDto(Author author) {
        if(author != null) {
            AuthorDto authorDto = AuthorDto.builder()
                    .fullNameVN(author.getFullNameVN())
                    .id(author.getId())
                    .build();
            return authorDto;
        }
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
