package com.exam.entities;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examId;
	
	@Column(nullable = false)
	private String examName;
	
	@Column(nullable = false)
	private float examDuration;
	
	@Column(nullable = false)
	private String examCode;
	
	transient private List<Paper> paper;
}
