package com.usbank.bean;

public class User {

	public int id;
	public String fname;
	public String lname;
	//@Email(message = "Email should be valid")
	public String email;
	
	public User(int id, String fname, String lname, String email){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
}
