package com.library.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibraryManagement.entity.Student;
import com.library.LibraryManagement.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public Student addStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> getStudents() {
		return repository.findAll();	
	}
	
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "Deleted ID::"+id;
	}
	
//	public List<Student> getAll(){
//		return repository.getStudentName();
//	}
}
