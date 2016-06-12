package com.emanuelgandrade.perguntasaoprofessor.domain;

import java.io.Serializable;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="classroom")
public class Classroom implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	@GeneratedValue
	private int id;
	@Column (name="name")
	private String name;
	@Column (name="subjectMatter")
	private String subjectMatter;
	@Column (name="teacher")
	private User teacher;
	
	@OneToMany
	private HashSet<User> users;

	public Classroom(String name, String subjectMatter, User teacher) {
		this.name = name;
		this.subjectMatter = subjectMatter;
		this.teacher = teacher;
		users = new HashSet<User>();
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

	public String getSubjectMatter() {
		return subjectMatter;
	}

	public void setSubjectMatter(String subjectMatter) {
		this.subjectMatter = subjectMatter;
	}

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public HashSet<User> getUsers() {
		return users;
	}

	public void setUsers(HashSet<User> users) {
		this.users = users;
	}
	
}
