package com.library.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.LibraryManagement.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
