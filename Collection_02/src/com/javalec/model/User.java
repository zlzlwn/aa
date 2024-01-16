package com.javalec.model;

public class User {

	String id;
	String pw;
	String adress;
	String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String id, String pw, String adress, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.adress = adress;
		this.phone = phone;
	}
	//Getter, Setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
