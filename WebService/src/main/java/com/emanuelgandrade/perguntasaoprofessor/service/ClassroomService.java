package com.emanuelgandrade.perguntasaoprofessor.service;

import java.util.List;

import com.emanuelgandrade.perguntasaoprofessor.domain.Classroom;

public interface ClassroomService {
	
	Classroom save(Classroom classroom);

	Classroom getById(int id);
	
	List<Classroom> listAllClassrooms();

}
