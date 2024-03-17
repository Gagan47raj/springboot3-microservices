package com.exam.service;

import java.util.List;

import com.exam.entities.Exam;

public interface ExamService {
	
	Exam save(Exam exam);
	List<Exam> findAll();
	Exam findById(int examId);
}
