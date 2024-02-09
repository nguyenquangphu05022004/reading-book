package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.ReadBookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IReadBookController implements GenericController<ReadBookDto> {

    @Override
    @PostMapping("/read-book")
    public ReadBookDto create(ReadBookDto object) {
        return null;
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
