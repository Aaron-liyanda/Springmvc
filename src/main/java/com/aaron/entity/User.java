package com.aaron.entity;

import org.springframework.stereotype.Repository;

public class User {
	
	private String name;
	private String Password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", Password=" + Password + "]";
	}
	

}
