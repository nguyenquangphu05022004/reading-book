package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.repository.EvalutionRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEvalutionService implements GenericCRUDService<EvaluationDto> {

    private EvalutionRepository evalutionRepository;

    @Autowired
    public IEvalutionService(EvalutionRepository evalutionRepository) {
        this.evalutionRepository = evalutionRepository;
    }


    @Override
    public EvaluationDto insert(EvaluationDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<EvaluationDto> recordOfList() {
        return null;
    }

    @Override
    public EvaluationDto update(EvaluationDto oldData) {
        return null;
    }
}
