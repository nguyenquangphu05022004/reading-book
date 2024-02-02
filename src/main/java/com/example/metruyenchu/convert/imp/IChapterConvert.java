package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.entity.Chapter;
import org.springframework.stereotype.Component;

@Component
public class IChapterConvert implements GenericConvert<Chapter, ChapterDto> {
    @Override
    public Chapter toEntity(ChapterDto chapterDto) {
        Chapter chapter = Chapter.builder()
                .chapterContent(chapterDto.getContent())
                .chapterName(chapterDto.getChapterName())
                .build();
        return chapter;
    }

    @Override
    public ChapterDto toDto(Chapter chapter) {
        ChapterDto chapterDto = ChapterDto.builder()
                .id(chapter.getId())
                .content(chapter.getChapterContent())
                .numberOfChapter(chapter.getNumberOfChapter())
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
}
