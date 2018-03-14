package com.elibrary.beans;

public class LibrarianBean {
	
	private int lib_id;
	private String lib_name,email,password;
	private int phn_no;

	public LibrarianBean() {}

	public LibrarianBean(int lib_id, String lib_name, String email, String password, int phn_no) {
		super();
		this.lib_id = lib_id;
		this.lib_name = lib_name;
		this.email = email;
		this.password = password;
		this.phn_no = phn_no;
	}

	public int getLib_id() {
		return lib_id;
	}

	public void setLib_id(int lib_id) {
		this.lib_id = lib_id;
	}

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(int phn_no) {
		this.phn_no = phn_no;
	}
	

}
