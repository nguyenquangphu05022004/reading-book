package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.repository.CategoryRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryService implements GenericCRUDService<CategoryDto> {

    private CategoryRepository categoryRepository;

    @Autowired
    public ICategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto insert(CategoryDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<CategoryDto> recordOfList() {
        return null;
    }

    @Override
    public CategoryDto update(CategoryDto oldData) {
        return null;
    }
}
