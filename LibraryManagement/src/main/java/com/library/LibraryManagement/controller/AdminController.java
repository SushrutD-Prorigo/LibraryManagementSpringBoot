package com.library.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.LibraryManagement.entity.Admin;
import com.library.LibraryManagement.repository.AdminRepository;
import com.library.LibraryManagement.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return service.addAdmin(admin);
	}
	
	@GetMapping("/getAdminList")
	public List<Admin> getAdmin(){
		return service.getAdmin();
	}

}
