package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.service.imp.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ICategoryController implements GenericController<CategoryDto> {
    private ICategoryService categoryService;

    @Autowired
    public ICategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public CategoryDto create(CategoryDto object) {
        return categoryService.saveData(object);
    }

    @Override
    public void delete(Long id) {
        categoryService.delete(id);
    }

    @Override
    public CategoryDto update(CategoryDto object, Long id) {
        object.setId(id);
        return categoryService.saveData(object);
    }

    @Override
    public List<CategoryDto> listObject() {
        return categoryService.recordOfList();
    }
}
