package com.hibernate.matrimonial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registeration_Tbl")

public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_ID")
	private int uid;
	
	@Column(name = "UserName")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Register(int uid, String name, String email, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
}
