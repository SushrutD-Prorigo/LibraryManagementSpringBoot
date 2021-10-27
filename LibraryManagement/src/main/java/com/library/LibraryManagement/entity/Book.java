package com.library.LibraryManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_information")
public class Book {
	@Id
	@GeneratedValue
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	private double bookCount;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookCount() {
		return bookCount;
	}
	public void setBookCount(double bookCount) {
		this.bookCount = bookCount;
	}
	@Override
	public String toString() {
		return "Book [ bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookCount=" + bookCount + "]";
	}
	
	

}
