package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.repository.CommentRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICommentService implements GenericCRUDService<CommentDto> {

    private CommentRepository commentRepository;

    @Autowired
    public ICommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @Override
    public CommentDto insert(CommentDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<CommentDto> recordOfList() {
        return null;
    }

    @Override
    public CommentDto update(CommentDto oldData) {
        return null;
    }
}
