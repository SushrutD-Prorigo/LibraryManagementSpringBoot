package com.library.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.LibraryManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
