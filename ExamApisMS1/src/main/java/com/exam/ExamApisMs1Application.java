package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExamApisMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamApisMs1Application.class, args);
	}

}
