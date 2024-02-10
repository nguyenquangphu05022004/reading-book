package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.BookView;
import com.example.metruyenchu.entity.BookViewCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookViewRepository extends JpaRepository<BookView, Long> {
    BookView findByBookId(Long bookId);
}
