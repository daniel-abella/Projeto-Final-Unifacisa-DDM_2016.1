package com.emanuelgandrade.perguntasaoprofessor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelgandrade.perguntasaoprofessor.domain.Classroom;
import com.emanuelgandrade.perguntasaoprofessor.service.ClassroomService;
import com.emanuelgandrade.perguntasaoprofessor.service.exception.ClassroomAlreadyExistsException;

@RestController
public class ClassroomController {
	
	private final ClassroomService classroomService;

	@Autowired
	public ClassroomController(final ClassroomService classroomService) {
		this.classroomService = classroomService;
	}

	@RequestMapping(value="/classroom", method = RequestMethod.GET)
	public ResponseEntity< List<Classroom> > listAllClassrooms() {
		return new ResponseEntity< List<Classroom> >
		(classroomService.listAllClassrooms(), HttpStatus.OK);
	}

	@RequestMapping(value = "/classroom/{id}",method = RequestMethod.GET)
	public ResponseEntity<Classroom> getClassroom(@PathVariable int id) {
		
		Classroom classroom = classroomService.getById(id);
		
		return classroom == null ? 
				new ResponseEntity<Classroom>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<Classroom>(classroom, HttpStatus.OK);
	}
	
	@RequestMapping(value="/classroom", method = RequestMethod.POST)
	public ResponseEntity<String> createClassroom(@RequestBody Classroom classroom) {

		try {
			classroomService.save(classroom);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		} catch (ClassroomAlreadyExistsException e) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleClassroomAlreadyExistsException(ClassroomAlreadyExistsException e) {
		return e.getMessage();
	}

	public ClassroomService getClassroomService() {
		return classroomService;
	}

}
