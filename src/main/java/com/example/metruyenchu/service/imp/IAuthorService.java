package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IAuthorConvert;
import com.example.metruyenchu.dto.AuthorDto;
import com.example.metruyenchu.entity.Author;
import com.example.metruyenchu.repository.AuthorRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IAuthorService implements GenericCRUDService<AuthorDto> {
    private AuthorRepository authorRepository;
    private IAuthorConvert iAuthorConvert;
    @Autowired
    public IAuthorService(AuthorRepository authorRepository,
                          IAuthorConvert iAuthorConvert) {
        this.authorRepository = authorRepository;
        this.iAuthorConvert = iAuthorConvert;
    }

    @Override
    public AuthorDto saveData(AuthorDto data) {
        return GenericService.saveData(
                data, data.getId(), iAuthorConvert,
                Author.class, authorRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(authorRepository, id);
    }

    @Override
    public List<AuthorDto> recordOfList() {
        return GenericService.recordOfList(authorRepository, iAuthorConvert);
    }
}
