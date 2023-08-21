package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class ControllerP1 {
	
	@GetMapping("/student")
	public List<Student> getWelcomeMessage()
	{
		return Arrays.asList(new Student("Sudhakar.S","Welcome to SpringBoot course"),
				(new Student("Sibiharan.R","Welcome to SpringBoot course")));
	}
}
