package com.library.LibraryManagement.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.LibraryManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	@Query("select s from Student s")
	public  List<Student> getStudentsByQuery();
	
	
}

