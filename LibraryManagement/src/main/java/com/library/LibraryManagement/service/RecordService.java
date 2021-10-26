package com.library.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibraryManagement.entity.Records;
import com.library.LibraryManagement.repository.RecordRepository;

@Service
public class RecordService {

	@Autowired
	RecordRepository repository;
	
	public Records addRecord(Records record) {
		return repository.save(record);
	}
	
	public List<Records> getAllRecord(){
		return repository.findAll();
	}
	
	public String deleteRecord(int id) {
		repository.deleteById(id);
		return "deleted records id:"+id;
	}
}
