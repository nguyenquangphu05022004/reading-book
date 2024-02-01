package com.example.metruyenchu.controller;

import java.util.List;

public interface GenericController<T> {
    T create(T object);
    void delete(Long id);
    T update(T object, Long id);
    List<T> listObject();
}
