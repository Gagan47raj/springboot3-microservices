package com.exam.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.exam.entities.Paper;

//@FeignClient(url = "http://localhost:8081", value = "paperClient")

@FeignClient(name = "PAPERAPISMS2")
public interface PaperClient {
	
	@GetMapping("/papers/exam/{examId}")
	List<Paper> findByExamId(@PathVariable int examId);	
}
