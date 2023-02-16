package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentService;

@RestController
public class MyController {
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public String home(){
		return "this is  Pankaj-home page"; 
	}
	
	//get the student details
	@GetMapping("/students")
	public List<Student> getStudent(){
		return studentService.getStudent();
			
	}
	
	
	
	@GetMapping("studentbyid/{studentid}")
	public Student getstudent(@PathVariable String studentid) {
		return studentService.getstudent(Long.parseLong(studentid));
	}
	
	
	
	@PostMapping("/students")
	public Student addstudent(@RequestBody Student student) {
		return studentService.addstudent(student);
	}

}
