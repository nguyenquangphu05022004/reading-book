package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IEvaluationConvert;
import com.example.metruyenchu.dto.CommentDto;
import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.entity.Evaluation;
import com.example.metruyenchu.repository.EvalutionRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IEvalutionService implements GenericCRUDService<EvaluationDto> {

    private EvalutionRepository evalutionRepository;
    private IEvaluationConvert iEvaluationConvert;
    private ICommentService commentService;
    @Autowired
    public IEvalutionService(EvalutionRepository evalutionRepository,
                             IEvaluationConvert iEvaluationConvert,
                             ICommentService commentService) {
        this.evalutionRepository = evalutionRepository;
        this.iEvaluationConvert = iEvaluationConvert;
        this.commentService = commentService;
    }


    @Override
    @Transactional
    public EvaluationDto saveData(EvaluationDto data) {

        CommentDto commentDto = commentService.saveData(data.getCommentDto());

        data.setCommentDto(commentDto);

        return GenericService.saveData(
                data, data.getId(), iEvaluationConvert,
                Evaluation.class, evalutionRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(evalutionRepository, id);
    }

    @Override
    public List<EvaluationDto> recordOfList() {
        return GenericService.recordOfList(evalutionRepository, iEvaluationConvert);
    }

}
