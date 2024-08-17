package com.example.myjava.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class PasswordChange {
	
	@Id
	private String id;
	private String name;
	private String password;
	
	public PasswordChange() {} //default constructor
	
	public PasswordChange(String nme,String pssword)
	{
		this.name = nme;
		this.password = pssword;
	}
	
	//Getters and Setters
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	
	
	
	
	
	
	
	
	
	

}
