package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.entity.Chapter;
import org.springframework.stereotype.Component;

@Component public class IChapterConvert implements GenericConvert<Chapter, ChapterDto> {
    @Override
    public Chapter toEntity(ChapterDto chapterDto) {
        return null;
    }

    @Override
    public ChapterDto toDto(Chapter chapter) {
        return null;
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
