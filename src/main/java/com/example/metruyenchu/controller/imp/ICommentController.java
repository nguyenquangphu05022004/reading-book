package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.service.imp.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ICommentController implements GenericController<CommentDto> {
    private ICommentService commentService;

    @Autowired
    public ICommentController(ICommentService commentService) {
        this.commentService =  commentService;
    }

    @Override
    @PostMapping("/comments")
    public CommentDto create(@RequestBody CommentDto object) {
        return commentService.saveData(object);
    }

    @Override
    public void delete(Long id) {
        commentService.delete(id);
    }

    @Override
    public CommentDto update(CommentDto object, Long id) {
        object.setId(id);
        return commentService.saveData(object);
    }

    @Override
    public List<CommentDto> listObject() {
        return commentService.recordOfList();
    }
}
