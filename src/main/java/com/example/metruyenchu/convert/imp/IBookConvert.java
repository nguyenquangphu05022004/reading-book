package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.entity.Book;
import org.springframework.stereotype.Component;

@Component public class IBookConvert implements GenericConvert<Book, BookDto> {

    @Override
    public Book toEntity(BookDto bookDto) {
        Book book = Book.builder()
                .bookName(bookDto.getBookName())
                .shortDescription(bookDto.getShortDescription())
                .thumbnail(bookDto.getThumbnail())
                .build();
        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = BookDto.builder()
                .bookName(book.getBookName())
                .thumbnail(book.getThumbnail())
                .shortDescription(book.getShortDescription())
                .id(book.getId())
                .build();
        return bookDto;
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
