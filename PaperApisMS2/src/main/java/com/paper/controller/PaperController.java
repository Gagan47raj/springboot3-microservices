package com.paper.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paper.entities.Paper;
import com.paper.service.PaperService;

@RestController
@RequestMapping("/papers")
public class PaperController {
	
	private PaperService paperService;
	
	public PaperController(PaperService paperService) {
		this.paperService = paperService;
	}
	
	@PostMapping
	public Paper save(@RequestBody Paper paper) {
		return paperService.add(paper);
	}
	
	@GetMapping
	public List<Paper> findAll(){
		return paperService.findAll();
	}
	
	@GetMapping("{paperId}")
	public Paper findById(@PathVariable int paperId) {
		return paperService.findById(paperId);
	}
	
	@GetMapping("/exam/{examId}")
	public List<Paper> findByExamId(@PathVariable int examId){
		return paperService.findByExamId(examId);
	}
}
