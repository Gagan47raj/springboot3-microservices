package com.paper.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paper.entities.Paper;

@Service
public interface PaperService {

	Paper add(Paper paper);
	
	List<Paper> findAll();
	
	Paper findById(int paperId);
	
	List<Paper> findByExamId(int examId);
}
