package com.springmvc.entity;

public class User {
	
	private int id;
	private String username;
	private String pwd;
	
	public User() {
		super();
	}

	public User(int id, String username, String pwd) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
