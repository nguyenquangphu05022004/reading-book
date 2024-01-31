package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IEvaluationConvert;
import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.entity.Evaluation;
import com.example.metruyenchu.repository.EvalutionRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEvalutionService implements GenericCRUDService<EvaluationDto> {

    private EvalutionRepository evalutionRepository;
    private IEvaluationConvert iEvaluationConvert;
    @Autowired
    public IEvalutionService(EvalutionRepository evalutionRepository,
                             IEvaluationConvert iEvaluationConvert) {
        this.evalutionRepository = evalutionRepository;
        this.iEvaluationConvert = iEvaluationConvert;
    }


    @Override
    public EvaluationDto saveData(EvaluationDto data) {
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
