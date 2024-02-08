package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.BookView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookViewRepository extends JpaRepository<BookView, Long> {
}
