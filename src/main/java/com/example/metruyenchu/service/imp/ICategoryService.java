package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.ICategoryConvert;
import com.example.metruyenchu.dto.CategoryDto;
import com.example.metruyenchu.entity.Category;
import com.example.metruyenchu.repository.CategoryRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryService implements GenericCRUDService<CategoryDto> {

    private CategoryRepository categoryRepository;
    private ICategoryConvert iCategoryConvert;
    @Autowired
    public ICategoryService(CategoryRepository categoryRepository,
                            ICategoryConvert iCategoryConvert) {
        this.categoryRepository = categoryRepository;
        this.iCategoryConvert = iCategoryConvert;
    }

    @Override
    public CategoryDto saveData(CategoryDto data) {
        return GenericService.saveData(
                data, data.getId(), iCategoryConvert,
                Category.class, categoryRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(categoryRepository, id);
    }

    @Override
    public List<CategoryDto> recordOfList() {
        return GenericService.recordOfList(categoryRepository, iCategoryConvert);
    }

}
