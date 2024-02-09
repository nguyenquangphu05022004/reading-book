package com.example.metruyenchu.convert;

import com.example.metruyenchu.dto.ReadBookDto;
import com.example.metruyenchu.entity.ReadBook;
import org.springframework.stereotype.Component;

@Component
public class IReadBookConvert implements GenericConvert<ReadBook, ReadBookDto> {
    @Override
    public ReadBook toEntity(ReadBookDto readBookDto) {
        return null;
    }

    @Override
    public ReadBookDto toDto(ReadBook readBook) {
        return null;
    }

    @Override
    public ReadBook toEntity(ReadBook readBook, ReadBookDto readBookDto) {
        return null;
    }

    @Override
    public ReadBookDto toDto(ReadBookDto readBookDto, ReadBook readBook) {
        return null;
    }
}
