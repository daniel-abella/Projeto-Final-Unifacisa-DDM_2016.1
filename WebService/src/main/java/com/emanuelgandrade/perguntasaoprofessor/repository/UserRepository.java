package com.emanuelgandrade.perguntasaoprofessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelgandrade.perguntasaoprofessor.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByName(String name);
	
}
