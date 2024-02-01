package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.ChapterDto;
import com.example.metruyenchu.service.imp.IChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IChapterController implements GenericController<ChapterDto> {

    private IChapterService chapterService;


    @Autowired
    public IChapterController(IChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @Override
    @PostMapping("/chapters")
    public ChapterDto create(ChapterDto object) {
        return chapterService.saveData(object);
    }

    @Override
    @DeleteMapping("/chapters/{id}")
    public void delete(@PathVariable("Id") Long id) {
        chapterService.delete(id);
    }

    @Override
    @PutMapping("/chapters/{id}")
    public ChapterDto update(ChapterDto object, @PathVariable("id") Long id) {
        object.setId(id);
        return chapterService.saveData(object);
    }

    @Override
    @GetMapping("/chapters")
    public List<ChapterDto> listObject() {
        return chapterService.recordOfList();
    }
}
