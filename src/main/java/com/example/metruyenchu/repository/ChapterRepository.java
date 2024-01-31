package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
