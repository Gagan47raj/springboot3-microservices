package com.paper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paper.entities.Paper;
import com.paper.repository.PaperRepository;
import com.paper.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {
	
	@Autowired
	PaperRepository paperRepository;
	
	@Override
	public Paper add(Paper paper) {
		return paperRepository.save(paper);
	}
	
	@Override
	public Paper findById(int paperId) {
		return paperRepository.findById(paperId).orElseThrow( () -> new RuntimeException("Paper not found"));
	}
	
	@Override
	public List<Paper> findAll() {
		return paperRepository.findAll();
	}

	@Override
	public List<Paper> findByExamId(int examId) {
		return paperRepository.findByExamId(examId);
	}
	
	
}
