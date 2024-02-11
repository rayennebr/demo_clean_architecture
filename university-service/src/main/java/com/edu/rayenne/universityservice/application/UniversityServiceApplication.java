package com.edu.rayenne.universityservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages ="com.edu.rayenne.universityservice.adapters")
public class UniversityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityServiceApplication.class, args);
	}

}
