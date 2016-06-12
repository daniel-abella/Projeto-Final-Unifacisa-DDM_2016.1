package com.emanuelgandrade.perguntasaoprofessor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")
public class User implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column (name="name")
	private String name;
	@Column (name="mail")
	private String mail;
	@Column (name="username")
	private String username;
	@Column (name="password", nullable=false)
	private String password;
	
	public User() {	
	}
	
	public User(String name, String mail, String username, String password) {
		this.name = name;
		this.mail = mail;
		this.username = username; 
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

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
