package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.ReadBookDto;
import com.example.metruyenchu.service.imp.IReadBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IReadBookController implements GenericController<ReadBookDto> {

    private IReadBookService readBookService;
    @Autowired
    public IReadBookController(IReadBookService readBookService) {
        this.readBookService = readBookService;
    }
    @Override
    @PostMapping("/read-book")
    public ReadBookDto create(@RequestBody ReadBookDto object) {
        return readBookService.saveData(object);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ReadBookDto update(ReadBookDto object, Long id) {
        return null;
    }

    @Override
    public List<ReadBookDto> listObject() {
        return null;
    }
}
