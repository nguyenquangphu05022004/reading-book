package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.entity.Evaluation;
import org.springframework.stereotype.Component;

@Component
public class IEvaluationConvert implements GenericConvert<Evaluation, EvaluationDto> {
    @Override
    public Evaluation toEntity(EvaluationDto evaluationDto) {
        return null;
    }

    @Override
    public EvaluationDto toDto(Evaluation evaluation) {
        return null;
    }

    @Override
    public Evaluation toEntity(Evaluation evaluation, EvaluationDto evaluationDto) {
        return null;
    }

    @Override
    public EvaluationDto toDto(EvaluationDto evaluationDto, Evaluation evaluation) {
        return null;
    }
}
