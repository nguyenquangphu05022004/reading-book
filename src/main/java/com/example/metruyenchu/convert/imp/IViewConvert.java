package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.ViewDto;
import com.example.metruyenchu.entity.View;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IViewConvert implements GenericConvert<View, ViewDto>, GenericConvertTw<View, ViewDto> {

    @Override
    public View toEntity(ViewDto viewDto) {
        return View.builder()
                .id(viewDto.getId())
                .viewsByDay(0)
                .viewsByMonth(0)
                .viewsTotal(0)
                .viewsByWeek(0)
                .build();
    }

    @Override
    public ViewDto toDto(View view) {
        return null;
    }

    @Override
    public View toEntity(View view, ViewDto viewDto) {
        return null;
    }

    @Override
    public ViewDto toDto(ViewDto viewDto, View view) {
        return null;
    }

    @Override
    public List<View> toEntity(List<ViewDto> list) {
        return list.stream().map((dto) -> toEntity(dto)).toList();
    }

    @Override
    public List<ViewDto> toDto(List<View> list) {
        return null;
    }
}
