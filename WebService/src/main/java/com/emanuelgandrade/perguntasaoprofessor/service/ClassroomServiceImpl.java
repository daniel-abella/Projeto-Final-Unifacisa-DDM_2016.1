package com.emanuelgandrade.perguntasaoprofessor.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.emanuelgandrade.perguntasaoprofessor.domain.Classroom;
import com.emanuelgandrade.perguntasaoprofessor.repository.ClassroomRepository;
import com.emanuelgandrade.perguntasaoprofessor.service.exception.ClassroomAlreadyExistsException;

public class ClassroomServiceImpl implements ClassroomService {

	private final ClassroomRepository repository;

    @Autowired
    public ClassroomServiceImpl(final ClassroomRepository repository) {
        this.repository = repository;
    }
    
    public Classroom getById(int id) {    
    	return repository.findOne(id);
    }
    
	public List<Classroom> listAllClassrooms() {
		return repository.findAll();
	}
	
    @Transactional
    public Classroom save(@NotNull @Valid final Classroom classroom) {
    	
        Classroom existing = repository.findOne(classroom.getId());
        
        if (existing != null) {
            throw new ClassroomAlreadyExistsException(String.format("There already exists a classroom with name=%s", classroom.getName()));
        }
        
        return repository.save(classroom);
    }

	public ClassroomRepository getRepository() {
		return repository;
	}
}
