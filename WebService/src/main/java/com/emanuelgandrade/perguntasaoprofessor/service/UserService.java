package com.emanuelgandrade.perguntasaoprofessor.service;

import java.util.List;

import com.emanuelgandrade.perguntasaoprofessor.domain.User;

public interface UserService {

	User save(User user);

	User getById(int id);
	
	List<User> listAllUsers();
}
