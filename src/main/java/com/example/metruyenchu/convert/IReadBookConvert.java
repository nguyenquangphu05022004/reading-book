package com.example.metruyenchu.convert;

import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.dto.ReadBookDto;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Chapter;
import com.example.metruyenchu.entity.ReadBook;
import com.example.metruyenchu.entity.User;
import org.springframework.stereotype.Component;

@Component
public class IReadBookConvert implements GenericConvert<ReadBook, ReadBookDto> {
    @Override
    public ReadBook toEntity(ReadBookDto readBookDto) {
        return ReadBook.builder()
                .book(Book.builder().id(readBookDto.getBookDto().getId()).build())
                .user(User.builder().id(readBookDto.getUserDto().getId()).build())
                .chapter(Chapter.builder().id(readBookDto.getChapterDto().getId()).build())
                .build();
    }

    @Override
    public ReadBookDto toDto(ReadBook readBook) {
        return ReadBookDto.builder()
                .id(readBook.getId())
                .bookDto(BookDto.builder().id(readBook.getBook().getId()).build())
                .userDto(UserDto.builder().id(readBook.getUser().getId()).build())
                .chapterDto(ChapterDto.builder().id(readBook.getChapter().getId()).build())
                .build();
    }

    @Override
    public ReadBook toEntity(ReadBook readBook, ReadBookDto readBookDto) {
        return null;
    }

    @Override
    public ReadBookDto toDto(ReadBookDto readBookDto, ReadBook readBook) {
        return null;
    }
}
