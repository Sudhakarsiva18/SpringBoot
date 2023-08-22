package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo rep;
	
	public Student getinfo(Student s) {
		return rep.save(s);
	}
	
	public List<Student> showinfo(){
		return rep.findAll();
	}
	
	public Student updateinfo(Student s) {
		return rep.saveAndFlush(s);
	}
	
	public void deleteinfo(Student s){
		rep.delete(s);
	}
}
