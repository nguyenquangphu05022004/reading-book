package com.example.metruyenchu.convert;

public interface GenericConvert<E, D>{
    E toEntity(D d);
    D toDto(E e);
    E toEntity(E e, D d);
    D toDto(D d, E e);
}
