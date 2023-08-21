package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService obj;
	
	@PostMapping("adddetails")
	public EmployeeEntity add(@RequestBody EmployeeEntity e){
		return obj.saveinfo(e);
	}
	
	@GetMapping("showdetails")
	public List<EmployeeEntity> show(){
		return obj.getinfo();	}

}
