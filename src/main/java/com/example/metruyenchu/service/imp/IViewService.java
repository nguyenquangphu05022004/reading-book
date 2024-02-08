package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IViewConvert;
import com.example.metruyenchu.dto.ViewDto;
import com.example.metruyenchu.entity.View;
import com.example.metruyenchu.repository.ViewRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IViewService implements GenericCRUDService<ViewDto> {
    private ViewRepository viewRepository;
    private IViewConvert viewConvert;
    @Autowired
    public IViewService(ViewRepository viewRepository,
                        IViewConvert viewConvert) {
        this.viewRepository = viewRepository;
        this.viewConvert = viewConvert;
    }
    @Override
    public ViewDto saveData(ViewDto data) {
        return GenericService.saveData(
                data, data.getId(), viewConvert,
                View.class, viewRepository
        );
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ViewDto> recordOfList() {
        return null;
    }
}
