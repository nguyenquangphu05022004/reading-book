package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IChapterConvert;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.entity.Chapter;
import com.example.metruyenchu.repository.ChapterRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IChapterService implements GenericCRUDService<ChapterDto> {

    private ChapterRepository chapterRepository;
    private IChapterConvert iChapterConvert;
    @Autowired
    public IChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @Override
    public ChapterDto saveData(ChapterDto data) {
        return GenericService.saveData(
                data, data.getId(), iChapterConvert,
                Chapter.class, chapterRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(chapterRepository, id);
    }

    @Override
    public List<ChapterDto> recordOfList() {
        return GenericService.recordOfList(chapterRepository, iChapterConvert);
    }


}
