package com.exam.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.Exam;
import com.exam.repository.ExamRepository;
import com.exam.service.ExamService;
import com.exam.service.PaperClient;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private PaperClient paperClient;
	
	public ExamServiceImpl(ExamRepository examRepository, PaperClient paperClient) {
		this.examRepository = examRepository;
		this.paperClient = paperClient;
	}
	
	@Override
	public Exam save(Exam exam) {	
		return examRepository.save(exam);
	}
	
	@Override
	public List<Exam> findAll() {
		List<Exam> exams = examRepository.findAll();
		List<Exam> newExam =  exams.stream().map(exam -> {
			exam.setPaper(paperClient.findByExamId(exam.getExamId()));
			return exam;
		}).collect(Collectors.toList());
		return newExam;
	}
	
	@Override
	public Exam findById(int examId) {
		Exam exam =  examRepository.findById(examId).orElseThrow(() -> new RuntimeException("Exam not found"));
		exam.setPaper(paperClient.findByExamId(exam.getExamId()));
		return exam;
	}
}
