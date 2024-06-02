package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.ReadBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadBookRepository extends JpaRepository<ReadBook, Long> {
}
