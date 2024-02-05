package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IChapterConvert implements GenericConvert<Chapter, ChapterDto>,
        GenericConvertTw<Chapter, ChapterDto> {

    @Override
    public Chapter toEntity(ChapterDto chapterDto) {
        Chapter chapter = Chapter.builder()
                .chapterContent(chapterDto.getContent())
                .chapterName(chapterDto.getChapterName())
                .book(Book.builder()
                        .id(chapterDto.getBookDto().getId()).build())
                .build();
        return chapter;
    }

    @Override
    public ChapterDto toDto(Chapter chapter) {
        ChapterDto chapterDto = ChapterDto.builder()
                .id(chapter.getId())
                .content(chapter.getChapterContent())
                .chapterName(chapter.getChapterName())
                .bookDto(BookDto.builder().id(chapter.getBook().getId())
                        .bookNameVn(chapter.getBook().getBookNameVn())
                        .build())
                .build();
        return chapterDto;
    }

    @Override
    public Chapter toEntity(Chapter chapter, ChapterDto chapterDto) {
        return null;
    }

    @Override
    public ChapterDto toDto(ChapterDto chapterDto, Chapter chapter) {
        return null;
    }

    @Override
    public List<Chapter> toEntity(List<ChapterDto> list) {
        return null;
    }

    @Override
    public List<ChapterDto> toDto(List<Chapter> list) {
        return null;
    }
}
