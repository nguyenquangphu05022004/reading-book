package com.example.metruyenchu.service;

import java.util.List;

public interface GenericCRUDService<T>{
    T saveData(T data);
    void delete(Long id);
    List<T> recordOfList();
}
