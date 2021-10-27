package com.library.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibraryManagement.entity.Admin;
import com.library.LibraryManagement.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repository;
	
	public Admin addAdmin(Admin admin) {
		return repository.save(admin);
		
	}
	
	public List<Admin> getAdmin(){
		return repository.findAll();
	}
	
	
}
