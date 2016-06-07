package com.emanuelgandrade.PerguntasAoProfessor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mail;
	private String username;
	private String password;
	
	public User() {	
	}
	
	public User(String name, String mail, String username, String password) {	
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
