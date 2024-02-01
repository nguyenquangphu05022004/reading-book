package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.service.imp.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IBookController implements GenericController<BookDto> {


    private IBookService bookService;

    @Autowired
    public IBookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public BookDto create(BookDto object) {
        return bookService.saveData(object);
    }

    @Override
    public void delete(Long id) {
        bookService.delete(id);
    }

    @Override
    public BookDto update(BookDto object, Long id) {
        object.setId(id);
        return bookService.saveData(object);
    }

    @Override
    public List<BookDto> listObject() {
        return bookService.recordOfList();
    }
}
