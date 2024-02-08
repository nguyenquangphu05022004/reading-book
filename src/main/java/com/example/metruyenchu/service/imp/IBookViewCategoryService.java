package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IBookViewCategoryConvert;
import com.example.metruyenchu.dto.BookViewCategoryDto;
import com.example.metruyenchu.entity.BookViewCategory;
import com.example.metruyenchu.repository.BookViewCategoryRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookViewCategoryService implements GenericCRUDService<BookViewCategoryDto> {
    private BookViewCategoryRepository bookViewCategoryRepository;
    private IBookViewCategoryConvert bookViewCategoryConvert;
    @Autowired
    public IBookViewCategoryService(BookViewCategoryRepository bookViewCategoryRepository,
                                    IBookViewCategoryConvert bookViewCategoryConvert) {
        this.bookViewCategoryRepository= bookViewCategoryRepository;
        this.bookViewCategoryConvert = bookViewCategoryConvert;
    }
    @Override
    public BookViewCategoryDto saveData(BookViewCategoryDto data) {
        return GenericService.saveData(
                data, data.getId(),bookViewCategoryConvert,
                BookViewCategory.class, bookViewCategoryRepository
        );
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<BookViewCategoryDto> recordOfList() {
        return null;
    }

}
