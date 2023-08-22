package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ser;
	
	@PostMapping("adddetails")
	public Student add(@RequestBody Student s) {
		return ser.getinfo(s);
	}
	
	@GetMapping("showdetails")
	public List<Student> show(){
		return ser.showinfo();
	}
	
	@PutMapping("updateDetails")
	public Student update(@RequestBody Student s) {
		return ser.updateinfo(s);
	}
	
	@DeleteMapping("deleteDetails")
	public String delete(@RequestBody Student s) {
		ser.deleteinfo(s);
		return "Deleted Successfully";
	}
}
