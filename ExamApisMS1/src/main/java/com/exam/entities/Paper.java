package com.exam.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paper {
	private int paperId;
	private String paperName;
	private String paperDescription;
	private int noOfQuestions;
	private int examId;

	
}
