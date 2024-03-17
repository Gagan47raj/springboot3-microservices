package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
