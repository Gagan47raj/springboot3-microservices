package com.exam.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entities.Exam;
import com.exam.service.ExamService;

@RestController
@RequestMapping("/exams")
public class ExamController {

	private ExamService examService;
	
	public ExamController(ExamService examService) {
		this.examService = examService;
	}
	
	@PostMapping
	public Exam save(@RequestBody Exam exam) {
		return examService.save(exam);
	}
	
	@GetMapping
	public List<Exam> findAll(){
		return examService.findAll();
	}
	
	@GetMapping("{examId}")
	public Exam findById(@PathVariable int examId) {
		return examService.findById(examId);
	}
}
