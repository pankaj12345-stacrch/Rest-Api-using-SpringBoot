package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentService {
	public List<Student>getStudent();
	public Student getstudent(long studentid);
	public Student addstudent(Student student);
	

}
