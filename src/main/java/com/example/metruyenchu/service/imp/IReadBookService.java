package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.constant.SystemConstant;
import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.IReadBookConvert;
import com.example.metruyenchu.dto.ReadBookDto;
import com.example.metruyenchu.entity.ReadBook;
import com.example.metruyenchu.repository.ReadBookRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IReadBookService implements GenericCRUDService<ReadBookDto> {

    private ReadBookRepository readBookRepository;
    private IReadBookConvert readBookConvert;
    private IBookViewService bookViewService;
    @Autowired
    public IReadBookService(ReadBookRepository readBookRepository,
                            IReadBookConvert readBookConvert,
                            IBookViewService bookViewService) {
        this.readBookRepository = readBookRepository;
        this.readBookConvert = readBookConvert;
        this.bookViewService = bookViewService;
    }

    @Override
    @Transactional
    public ReadBookDto saveData(ReadBookDto data) {
        bookViewService.trackViews(data.getBookDto().getId(), SystemConstant.TRACK_VIEW_READS);
        return GenericService.saveData(
                data, data.getId(), readBookConvert,
                ReadBook.class, readBookRepository
        );
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ReadBookDto> recordOfList() {
        return null;
    }
}
