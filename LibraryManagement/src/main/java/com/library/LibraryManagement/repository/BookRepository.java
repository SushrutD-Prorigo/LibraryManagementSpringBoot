package com.library.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.LibraryManagement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Query("select u from Book u where u.bookId= :n")
	public Book searchById(@Param("n") int id);

}
