package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo obj;
	
	public EmployeeEntity saveinfo(EmployeeEntity e)	{
		return obj.save(e);
	}
	
	public List<EmployeeEntity> getinfo(){
		return obj.findAll();
	}
	
}
