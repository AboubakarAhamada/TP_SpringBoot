package com.example;

public class User {
	
	private String name;
	private String email;
	private String career;
	
	public User(String name, String email, String carrieer) {
		super();
		this.name = name;
		this.email = email;
		this.career = carrieer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	} 
	
	

}
