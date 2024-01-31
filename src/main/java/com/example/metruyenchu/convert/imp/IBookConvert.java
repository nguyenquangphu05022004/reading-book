package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.entity.Book;
import org.springframework.stereotype.Component;

@Component public class IBookConvert implements GenericConvert<Book, BookDto> {

    @Override
    public Book toEntity(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto toDto(Book book) {
        return null;
    }

    @Override
    public Book toEntity(Book book, BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto toDto(BookDto bookDto, Book book) {
        return null;
    }
}
