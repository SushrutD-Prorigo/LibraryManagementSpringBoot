package com.library.LibraryManagement.controller;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.library.LibraryManagement.entity.Book;
import com.library.LibraryManagement.entity.Student;
import com.library.LibraryManagement.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/add_book")
	public String showForm(Model model) {
		Book book = new Book();
		model.addAttribute("book",book);
		return "book_form";
	}
	
	@PostMapping("/add_book")
	public String submitBook(@ModelAttribute("book") Book book) {
		System.out.println(book);
		service.addBook(book);
		return "add_book_success";
	}
	
	@RequestMapping("/show_all_books")
	public String showBooks(Model model) {
		model.addAttribute("books", service.getBooks());
		return "show_books";
	}
	
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

	@GetMapping("/delete_book_by_id")
	public String deleteBookFromDB(Model model) {
		model.addAttribute("book", new Book());
		return "book_id_form";
	}
	
	@PostMapping("/delete_book")
	public String deleteBookById(@ModelAttribute("book") Book book) {
		System.out.println(book);
		service.deleteBook(book.getBookId());
		return "admin_operation";
	}
	
	@GetMapping("/search_book_by_id")
	public String searchStudentFromDB(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "book_search_form";
	}
	
	@PostMapping("/search_book")
	public ModelAndView searchStudentById(@ModelAttribute("book") Book book) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("search_book_result");
		mav.addObject("book", service.getBookById(book.getBookId()));
		
		return mav;
	}
}
