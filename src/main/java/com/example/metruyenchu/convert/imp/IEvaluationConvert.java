package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Comment;
import com.example.metruyenchu.entity.Evaluation;
import com.example.metruyenchu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IEvaluationConvert implements GenericConvert<Evaluation, EvaluationDto>,
        GenericConvertTw<Evaluation, EvaluationDto> {

    private ICommentConvert commentConvert;

    @Autowired
    public IEvaluationConvert(ICommentConvert commentConvert) {
        this.commentConvert = commentConvert;
    }

    @Override
    public Evaluation toEntity(EvaluationDto evaluationDto) {
        Evaluation evaluation = Evaluation.builder()
                .book(Book.builder().id(evaluationDto.getBookDto().getId()).build())
                .comment(Comment.builder().id(evaluationDto.getCommentDto().getId()).build())
                .plotContent(evaluationDto.getPlotContent())
                .worldLayout(evaluationDto.getWorldLayout())
                .personOfCharacter(evaluationDto.getPersonOfCharacter())
                .build();
        return evaluation;
    }

    @Override
    public EvaluationDto toDto(Evaluation evaluation) {
        EvaluationDto evaluationDto = EvaluationDto.builder()
                .personOfCharacter(evaluation.getPersonOfCharacter())
                .id(evaluation.getId())
                .plotContent(evaluation.getPlotContent())
                .worldLayout(evaluation.getWorldLayout())
                .commentDto(commentConvert.toDto(evaluation.getComment()))
                .build();
        return evaluationDto;
    }

    @Override
    public Evaluation toEntity(Evaluation evaluation, EvaluationDto evaluationDto) {
        return null;
    }

    @Override
    public EvaluationDto toDto(EvaluationDto evaluationDto, Evaluation evaluation) {
        return null;
    }

    @Override
    public List<Evaluation> toEntity(List<EvaluationDto> list) {
        return list != null ? list.stream().map((dto) -> {
            return toEntity(dto);
        }).toList() : null;
    }

    @Override
    public List<EvaluationDto> toDto(List<Evaluation> list) {
        return list != null ? list.stream().map((e) -> {
            return toDto(e);
        }).toList() : null;
    }
}
