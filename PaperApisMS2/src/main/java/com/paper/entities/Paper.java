package com.paper.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paperId;
	
	@Column(nullable = false)
	private String paperName;
	
	@Column(nullable = false)
	private String paperDescription;
	
	@Column(nullable = false)
	private int noOfQuestions;
	
	@Column(nullable = false)
	private int examId;
	
}
