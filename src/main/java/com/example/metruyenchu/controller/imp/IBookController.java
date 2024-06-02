package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.service.imp.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/books")
    public BookDto create(@RequestBody BookDto object) {
        return bookService.saveData(object);
    }

    @Override
    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        bookService.delete(id);
    }

    @Override
    @PutMapping("/books/{id}")
    public BookDto update(@RequestBody BookDto object, @PathVariable(name = "id") Long id) {
        object.setId(id);
        return bookService.saveData(object);
    }

    @Override
    @GetMapping("/books")
    public List<BookDto> listObject() {
        return bookService.recordOfList();
    }
}
