package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.BookViewCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookViewCategoryRepository extends JpaRepository<BookViewCategory, Long> {
}
