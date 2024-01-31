package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IBookConvert;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.repository.BookRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBookService implements GenericCRUDService<BookDto> {

    private BookRepository bookRepository;
    private IBookConvert bookConvert;
    @Autowired
    public IBookService(BookRepository bookRepository,
                        IBookConvert iBookConvert) {
        this.bookRepository = bookRepository;
        this.bookConvert = iBookConvert;
    }


    @Override
    public BookDto saveData(BookDto data) {
        return GenericService.saveData(
                data, data.getId(), bookConvert,
                Book.class, bookRepository
        );
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
