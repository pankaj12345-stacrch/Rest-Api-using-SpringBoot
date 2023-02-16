package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Student;


@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student> list;
	
	public StudentServiceImpl() {
		list= new ArrayList<>();
		list.add(new Student(101,"Pankaj","Bsc cs"));
		list.add(new Student(102,"Tarun","MBBS"));
		list.add(new Student(103,"Teknath","Engineering"));
		list.add(new Student(104,"Kartikkesh","Accountant"));
		
		
		
		
	}
	@Override
	public List<Student> getStudent() {
		return list;
	}
	@Override
	public Student getstudent(long studentId) {
		Student s=null;
		for(Student student:list) {
			if(student.getId()==studentId) {
				s=student;
				break;
				
			}
		}
		return s;
		
		
	}
	@Override
	public Student addstudent(Student student) {
		list.add(student);
		return student;
	}

	

}
