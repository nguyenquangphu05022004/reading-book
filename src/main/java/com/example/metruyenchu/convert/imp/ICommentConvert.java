package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class ICommentConvert implements GenericConvert<Comment, CommentDto> {
    @Override
    public Comment toEntity(CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto toDto(Comment comment) {
        return null;
    }

    @Override
    public Comment toEntity(Comment comment, CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto toDto(CommentDto commentDto, Comment comment) {
        return null;
    }
}
