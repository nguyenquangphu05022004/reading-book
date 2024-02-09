package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.BookViewCategoryDto;
import com.example.metruyenchu.service.imp.IBookViewCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class IBookViewCategoryController implements GenericController<BookViewCategoryDto> {

    private IBookViewCategoryService bookViewCategoryService;
    @Autowired
    public IBookViewCategoryController(IBookViewCategoryService bookViewCategoryService) {
        this.bookViewCategoryService = bookViewCategoryService;
    }

    @Override
    @PostMapping("/book/view/types")
    public BookViewCategoryDto create(@RequestBody BookViewCategoryDto object) {
        return bookViewCategoryService.saveData(object);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public BookViewCategoryDto update(BookViewCategoryDto object, Long id) {
        return null;
    }

    @Override
    public List<BookViewCategoryDto> listObject() {
        return null;
    }
}
