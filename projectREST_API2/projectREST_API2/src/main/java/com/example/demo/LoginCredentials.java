package com.example.demo;

public class LoginCredentials {
	
	private String email;
	private String pwd;
	public LoginCredentials(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
