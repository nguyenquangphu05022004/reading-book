package com.example.metruyenchu.service;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.exception.ResourceNotFoundException;
import com.example.metruyenchu.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class GenericService {

     public static <T> T findOneById(
             JpaRepository r,
             Long id,
             Class<T> tClass
     ) {
         Optional<T> data = r.findById(id);
         return data.orElseThrow(() -> new ResourceNotFoundException(tClass + " not found id: " + id));
     }

    private static <T> T update(JpaRepository r,
                                T data, Long id,
                                Class<?> entityClass,
                                GenericConvert genericConvert) {
        Object oldT = GenericService.findOneById(r, id, entityClass);
        T value = (T) genericConvert.toDto(data, oldT);
        return insert(value, genericConvert, r);
    }

    private static <T> T insert(T data, GenericConvert genericConvert,
                               JpaRepository r) {
        return (T) genericConvert
                .toDto(r.save(genericConvert.toEntity(data)));
    }

    public static <E, D> D saveData(
            D data, Long id, GenericConvert genericConvert,
            Class<E> entityClass, JpaRepository jpaRepository
    )   {
         if(id != null) return update(
                 jpaRepository, data, id, entityClass, genericConvert
         );
         return insert(data, genericConvert, jpaRepository);
    }

    public static void deleteById(JpaRepository repository, Long id) {
         repository.deleteById(id);
    }

    public static <E, D> List<D> recordOfList(JpaRepository repository,
                                              GenericConvert convert) {
         List<E> list = repository.findAll();
         return list.stream().map((e) -> {
             return (D)convert.toDto(e);
         }).collect(Collectors.toList());
    }
}
