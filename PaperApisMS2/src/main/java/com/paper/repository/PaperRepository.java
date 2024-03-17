package com.paper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paper.entities.Paper;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer> {
	List<Paper> findByExamId(int examId); 
}
