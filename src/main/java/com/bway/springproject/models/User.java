package com.bway.springproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")


public class User {
	
	@Id
	
	@GeneratedValue
	
	private int id;
	@Column
	private String email;

	

	@Column
	private String fname;
	@Column
	private String lname;
	
	@Column
	private String gender;
//	@Column
//	private String address;
//	@Column
//	private String contactno;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String state;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStates() {
		return state;
	}
	public void setStates(String states) {
		this.state = states;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	



	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getContactno() {
//		return contactno;
//	}
//	public void setContactno(String contactno) {
//		this.contactno = contactno;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
