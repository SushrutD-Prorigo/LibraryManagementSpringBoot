package com.library.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.library.LibraryManagement.entity.Admin;
import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService service;
	

	@GetMapping("/admin_login_test")
	public String showForm() {
		return "admin_login";
	}
	
	@PostMapping("/admin_login_success")
	public String showMenu() {
		return "admin_operation";
	}
	
	@GetMapping("/admin_login_success")
	public String showMenuRedirect() {
		return "admin_operation";
	}
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return service.addAdmin(admin);
	}
	
	@GetMapping("/getAdminList")
	public List<Admin> getAdmin(){
		return service.getAdmin();
	}

	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("admin", new Admin());
		return mv;
	}
	

}
