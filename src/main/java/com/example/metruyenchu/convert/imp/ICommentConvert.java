package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Comment;
import com.example.metruyenchu.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ICommentConvert implements GenericConvert<Comment, CommentDto>,
        GenericConvertTw<Comment, CommentDto> {
    @Override
    public Comment toEntity(CommentDto commentDto) {
        Comment comment = Comment.builder()
                .commentContent(commentDto.getCommentContent())
                .numberLikeOfComment(commentDto.getNumberLikeOfComment()
                        == null ? 0 : commentDto.getNumberLikeOfComment())
                .userComment(User.builder()
                        .id(commentDto.getUserDto().getId()).build())
                .book(Book.builder().id(commentDto.getBookDto().getId()).build())
                .build();
        return comment;
    }

    @Override
    public CommentDto toDto(Comment comment) {
        CommentDto commentDto = CommentDto.builder()
                .commentContent(comment.getCommentContent())
                .numberLikeOfComment(comment.getNumberLikeOfComment())
                .id(comment.getId())
                .userDto(getUserDto(comment.getUserComment()))
                .build();

        return commentDto;
    }

    @Override
    public Comment toEntity(Comment comment, CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto toDto(CommentDto commentDto, Comment comment) {
        return null;
    }



    private UserDto getUserDto(User userComment) {
        if(userComment == null) return null;
        else {
            User.Account account = userComment.getAccount();
            return UserDto.builder()
                    .id(userComment.getId())
                    .account(UserDto.AccountDto.builder()
                            .username(account == null ? null : account.getUsername())
                            .build())
                    .build();
        }
    }

    @Override
    public List<Comment> toEntity(List<CommentDto> list) {
        return null;
    }

    @Override
    public List<CommentDto> toDto(List<Comment> list) {
        return list != null ? list.stream().map((e) -> {
            return toDto(e);
        }).toList() : null;
    }
}
