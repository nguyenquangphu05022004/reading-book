package com.example.metruyenchu.convert;

import java.util.List;
import java.util.Set;

public interface GenericConvertTw <E, D>{

    List<E> toEntity(List<D> list);
    List<D> toDto(List<E> list);

}
