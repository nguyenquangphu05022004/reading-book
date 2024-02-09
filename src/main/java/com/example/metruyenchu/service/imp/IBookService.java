package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IBookConvert;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.BookViewCategoryDto;
import com.example.metruyenchu.dto.BookViewDto;
import com.example.metruyenchu.dto.ViewDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.BookViewCategory;
import com.example.metruyenchu.repository.BookRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IBookService implements GenericCRUDService<BookDto> {

    private BookRepository bookRepository;
    private IBookConvert bookConvert;
    private IBookViewService bookViewService;
    private IBookViewCategoryService bookViewCategoryService;
    private IViewService viewService;

    @Autowired
    public IBookService(BookRepository bookRepository,
                        IBookConvert iBookConvert,
                        IBookViewService bookViewService,
                        IBookViewCategoryService bookViewCategoryService,
                        IViewService viewService) {
        this.bookRepository = bookRepository;
        this.bookConvert = iBookConvert;
        this.bookViewService = bookViewService;
        this.bookViewCategoryService = bookViewCategoryService;
        this.viewService = viewService;
    }


    @Override
    @Transactional
    public BookDto saveData(BookDto data) {
        BookDto bookDto = GenericService.saveData(
                data, data.getId(), bookConvert,
                Book.class, bookRepository
        );
        if (data.getId() == null) {
            BookViewDto bookViewDto = bookViewService.saveData(BookViewDto.builder()
                    .bookDto(bookDto).build());
            List<BookViewCategoryDto> bookViewCategoryDtos = bookViewCategoryService.recordOfList();
            for (BookViewCategoryDto dto : bookViewCategoryDtos) {
                viewService.saveData(ViewDto.builder()
                        .bookViewDto(bookViewDto)
                        .bookViewCategoryDto(dto)
                        .build());
            }
        }
        return bookDto;
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(bookRepository, id);
    }

    @Override
    public List<BookDto> recordOfList() {
        return GenericService.recordOfList(bookRepository, bookConvert);
    }


}
