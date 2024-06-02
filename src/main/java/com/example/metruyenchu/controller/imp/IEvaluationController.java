package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.EvaluationDto;
import com.example.metruyenchu.service.imp.IEvalutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IEvaluationController implements GenericController<EvaluationDto> {

    private IEvalutionService evalutionService;

    @Autowired
    public IEvaluationController(IEvalutionService evalutionService) {
        this.evalutionService = evalutionService;
    }

    @Override
    @PostMapping("/evaluations")
    public EvaluationDto create(@RequestBody EvaluationDto object) {
        return evalutionService.saveData(object);
    }

    @Override
    @DeleteMapping("/evaluations/{id}")
    public void delete(@PathVariable("id") Long id) {
        evalutionService.delete(id);
    }

    @Override
    @PostMapping("/evaluations/{id}")
    public EvaluationDto update(EvaluationDto object,@PathVariable("id") Long id) {
        object.setId(id);
        return evalutionService.saveData(object);
    }

    @Override
    @GetMapping("/evaluations")
    public List<EvaluationDto> listObject() {
        return evalutionService.recordOfList();
    }
}
