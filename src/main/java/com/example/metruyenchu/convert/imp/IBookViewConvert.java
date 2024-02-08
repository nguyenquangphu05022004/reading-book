package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.BookViewDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.BookView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class IBookViewConvert implements GenericConvert<BookView, BookViewDto> {

    private IBookConvert bookConvert;
    private IViewConvert viewConvert;
    @Autowired
    public IBookViewConvert(IBookConvert bookConvert,
                            IViewConvert viewConvert) {
        this.bookConvert = bookConvert;
        this.viewConvert = viewConvert;
    }

    @Override
    public BookView toEntity(BookViewDto bookViewDto) {
        return BookView.builder()
                .id(bookViewDto.getId())
                .book(Book.builder().id(bookViewDto.getBookDto().getId()).build())
                .week(LocalDateTime.now())
                .day(LocalDateTime.now())
                .month(LocalDateTime.now())
                .views(viewConvert.toEntity(bookViewDto.getViewDtos()))
                .build();
    }

    @Override
    public BookViewDto toDto(BookView bookView) {
        BookViewDto bookViewDto = BookViewDto.builder()
                .bookDto(bookConvert.toDto(bookView.getBook()))
                .id(bookView.getId())
                .week(bookView.getWeek())
                .day(bookView.getDay())
                .week(bookView.getWeek())
                .build();
        return bookViewDto;
    }

    @Override
    public BookView toEntity(BookView bookView, BookViewDto bookViewDto) {
        return null;
    }

    @Override
    public BookViewDto toDto(BookViewDto bookViewDto, BookView bookView) {
        return null;
    }
}
