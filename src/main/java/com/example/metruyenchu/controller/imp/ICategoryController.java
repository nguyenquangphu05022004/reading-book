package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.service.imp.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/categories")
    public CategoryDto create(@RequestBody CategoryDto object) {
        return categoryService.saveData(object);
    }

    @Override
    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
    }

    @Override
    @PutMapping("/categories/{id}")
    public CategoryDto update(@RequestBody CategoryDto object,@PathVariable Long id) {
        object.setId(id);
        return categoryService.saveData(object);
    }

    @Override
    @GetMapping("/categories")
    public List<CategoryDto> listObject() {
        return categoryService.recordOfList();
    }
}
