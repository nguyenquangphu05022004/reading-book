package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewRepository extends JpaRepository<View, Long> {
    View findByBookViewIdAndBookViewCategoryId(Long bookViewId, Long bookViewCategoryId);
}
