package com.library.LibraryManagement.controller;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return service.getBooks();
	}
	
	@GetMapping("/bookById/{id}")
	public Book getBook(@PathVariable int id) {
		return service.getBookById(id);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
	}

}
