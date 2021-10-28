package com.library.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.entity.Records;
import com.library.LibraryManagement.service.RecordService;

@Controller
public class RecordController {

	@Autowired
	RecordService service;
	
	@GetMapping("/add_new_record")
	public String showForm(Model model) {
		model.addAttribute("records", new Records());
		return "record_form";
	}
	
	@PostMapping("/add_new_record")
	public String submitBook(@ModelAttribute("records") Records records) {
		//System.out.println(records);
		service.addRecord(records);
		return "add_record_success";
	}
	
	@PostMapping("/addRecord")
	public Records addRecord(@RequestBody Records record) {
		return service.addRecord(record);
	}
	
	@GetMapping("/getAllRecords")
	public List<Records> findAllRecords(){
		return service.getAllRecord();
	}
	
	@DeleteMapping("/deleteRecord/{id}")
	public String deleteRecord(@PathVariable int id) {
		return service.deleteRecord(id);
	}
	
}
