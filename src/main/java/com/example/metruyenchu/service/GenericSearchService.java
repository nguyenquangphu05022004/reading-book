package com.example.metruyenchu.service;

import com.example.metruyenchu.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public class GenericSearchService {

     public static <T> T findOneById(
             JpaRepository r,
             Long id,
             Class<T> tClass
     ) {
         Optional<T> data = r.findById(id);
         return data.orElseThrow(() -> new ResourceNotFoundException(tClass + " not found id: " + id));
     }

}
