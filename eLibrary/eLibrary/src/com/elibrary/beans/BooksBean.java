package com.elibrary.beans;

public class BooksBean {
	private String book_id,book_name,author;
	private int quantity,issue;
	public BooksBean(){
		super();
	}
	public BooksBean(String book_id,String book_name,String author,int quantity,int issue){
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		this.quantity = quantity;
		this.issue = issue;
		}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getIssue() {
		return issue;
	}
	public void setIssue(int issue) {
		this.issue = issue;
	}
	
}
