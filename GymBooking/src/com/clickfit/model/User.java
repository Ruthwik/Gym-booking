package com.clickfit.model;

public class User {
	String id;
	String FirstName;
	String LastName;
	String Address;
	String email;

	public User(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
