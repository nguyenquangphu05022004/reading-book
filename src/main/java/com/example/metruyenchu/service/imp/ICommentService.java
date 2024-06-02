package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.ICommentConvert;
import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.entity.Comment;
import com.example.metruyenchu.repository.CommentRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICommentService implements GenericCRUDService<CommentDto> {

    private CommentRepository commentRepository;
    private ICommentConvert iCommentConvert;

    @Autowired
    public ICommentService(CommentRepository commentRepository,
                           ICommentConvert iCommentConvert) {
        this.commentRepository = commentRepository;
        this.iCommentConvert = iCommentConvert;
    }


    @Override
    public CommentDto saveData(CommentDto data) {
        return GenericService.saveData(
                data, data.getId(), iCommentConvert,
                Comment.class, commentRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(commentRepository, id);
    }

    @Override
    public List<CommentDto> recordOfList() {
        return GenericService.recordOfList(commentRepository, iCommentConvert);
    }

}
