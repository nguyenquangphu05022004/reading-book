package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.AuthorDto;
import com.example.metruyenchu.repository.AuthorRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAuthorService implements GenericCRUDService<AuthorDto> {
    private AuthorRepository authorRepository;

    @Autowired
    public IAuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorDto insert(AuthorDto data) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AuthorDto> recordOfList() {
        return null;
    }

    @Override
    public AuthorDto update(AuthorDto oldData) {
        return null;
    }
}
