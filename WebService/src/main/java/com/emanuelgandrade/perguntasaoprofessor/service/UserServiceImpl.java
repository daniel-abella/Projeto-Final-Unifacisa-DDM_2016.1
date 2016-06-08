package com.emanuelgandrade.perguntasaoprofessor.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.emanuelgandrade.perguntasaoprofessor.domain.User;
import com.emanuelgandrade.perguntasaoprofessor.repository.UserRepository;
import com.emanuelgandrade.perguntasaoprofessor.service.exception.UserAlreadyExistsException;

@Service
@Validated
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }
    
    public User getById(int id) {    
    	return repository.findOne(id);
    }
    
	public List<User> listAllUsers() {
		return repository.findAll();
	}
	
    @Transactional
    public User save(@NotNull @Valid final User user) {
    	
        User existing = repository.findOne(user.getId());
        
        if (existing != null) {
            throw new UserAlreadyExistsException(String.format("There already exists a participant with email=%s", user.getName()));
        }
        
        return repository.save(user);
    }

	public UserRepository getRepository() {
		return repository;
	}
}
