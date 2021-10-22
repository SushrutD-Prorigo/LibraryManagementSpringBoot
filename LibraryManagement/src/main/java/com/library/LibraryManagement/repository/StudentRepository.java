package com.library.LibraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.LibraryManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
