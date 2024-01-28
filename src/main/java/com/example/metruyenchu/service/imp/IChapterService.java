package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.repository.BookRepository;
import com.example.metruyenchu.repository.ChapterRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IChapterService implements GenericCRUDService<ChapterDto> {

    private ChapterRepository chapterRepository;

    @Autowired
    public IChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @Override
    public ChapterDto insert(ChapterDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ChapterDto> recordOfList() {
        return null;
    }

    @Override
    public ChapterDto update(ChapterDto oldData) {
        return null;
    }

}
