package com.library.LibraryManagement.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.entity.Student;
import com.library.LibraryManagement.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/student_login_test")
	public String showForm() {
		return "student_login";
	}
	
	@PostMapping("/student_login_success")
	public String showMenu() {
		return "student_operation";
	}
	
	@GetMapping("/student_login_success")
	public String showMenuRedirect() {
		return "student_operation";
	}
	
	
	@GetMapping("/add_student")
	public String showForm(Model model) {
		model.addAttribute("student",new Student());
		return "student_form";
	}
	
	@PostMapping("/add_student")
	public String submitBook(@ModelAttribute("student") Student student) {
		System.out.println(student);
		service.addStudent(student);
		return "add_student_success";
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return service.getStudents();	
	}
	
	@GetMapping("/studentById/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
	@GetMapping("/delete_student_by_id")
	public String deleteStudentFromDB(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student_id_form";
	}

	@PostMapping("delete_student")
	public String deleteStudentById(@ModelAttribute("student") Student student) {
		System.out.println(student);
		service.deleteStudent(student.getStudentId());
		return "admin_operation";
	}
	
	
}
