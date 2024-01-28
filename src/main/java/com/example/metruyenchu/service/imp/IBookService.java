package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.service.GenericCRUDService;

import java.util.List;

public class IBookService implements GenericCRUDService<BookDto> {
    @Override
    public BookDto insert(BookDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<BookDto> recordOfList() {
        return null;
    }

    @Override
    public BookDto update(BookDto oldData) {
        return null;
    }

}
