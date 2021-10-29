package com.library.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public Book addBook(Book book) {
		return repository.save(book);
	}
	
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	public Book getBookById(int id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Book searchBook(int id) {
		return repository.searchById(id);
	}
	
	public String deleteBook(int id) {
		repository.deleteById(id);
		return "DELETE BOOK/n ID:"+id;
	}
}
