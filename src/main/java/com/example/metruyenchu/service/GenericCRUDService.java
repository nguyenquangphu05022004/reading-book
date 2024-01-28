package com.example.metruyenchu.service;

import java.util.List;

public interface GenericCRUDService<T>{
    T insert(T data);
    void delete(Long id);
    List<T> recordOfList();

    T update(T oldData);


}
