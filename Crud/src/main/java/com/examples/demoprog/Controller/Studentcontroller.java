package com.examples.demoprog.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.demoprog.Entity.Student;
import com.examples.demoprog.Repository.StudentRepo;



@RestController
public class Studentcontroller {

	@Autowired
	public StudentRepo rep;
	
	@PostMapping("/add")
	public Student adddata(@RequestBody Student student){
		rep.save(student);
		return student;
	}
	@GetMapping("/getall")
	public List<Student>getAllUsers(){
		return rep.findAll();
		
		
	}}
