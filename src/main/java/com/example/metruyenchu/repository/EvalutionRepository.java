package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvalutionRepository extends JpaRepository<Evaluation, Long> {
}
