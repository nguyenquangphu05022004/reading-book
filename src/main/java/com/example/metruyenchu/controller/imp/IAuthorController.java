package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.AuthorDto;
import com.example.metruyenchu.service.imp.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IAuthorController implements GenericController<AuthorDto> {

    private IAuthorService authorService;

    @Autowired
    public IAuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    @PostMapping("/authors")
    public AuthorDto create(AuthorDto object) {
        return authorService.saveData(object);
    }

    @Override
    @DeleteMapping("/authors/{id}")
    public void delete(@PathVariable("id") Long id) {
        authorService.delete(id);
    }

    @Override
    @PutMapping("/authors/{id}")
    public AuthorDto update(AuthorDto object, @PathVariable("Id") Long id) {
        object.setId(id);
        return authorService.saveData(object);
    }

    @Override
    @GetMapping("/authors")
    public List<AuthorDto> listObject() {
        return authorService.recordOfList();
    }
}
