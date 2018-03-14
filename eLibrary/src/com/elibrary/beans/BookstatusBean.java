package com.elibrary.beans;
 
import java.sql.Date;

public class BookstatusBean {
private String book_id,student_id,student_name;
private int mobile_no;
private Date issue_date;
private String status;

public BookstatusBean() {}
public BookstatusBean(String book_id, String student_id, String student_name, int mobile_no) {
	super();
	this.book_id = book_id;
	this.student_id = student_id;
	this.student_name = student_name;
	this.mobile_no = mobile_no;
}
public String getBook_id() {
	return book_id;
}
public void setBook_id(String book_id) {
	this.book_id = book_id;
}
public String getStudent_id() {
	return student_id;
}
public void setStudent_id(String student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public int getMobile_no() {
	return mobile_no;
}
public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}
public Date getIssue_date() {
	return issue_date;
}
public void setIssue_date(Date issue_date) {
	this.issue_date = issue_date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}