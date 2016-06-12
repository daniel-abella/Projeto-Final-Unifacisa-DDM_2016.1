package com.emanuelgandrade.perguntasaoprofessor.service.exception;

public class ClassroomAlreadyExistsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassroomAlreadyExistsException(final String message) {
        super(message);
    }
}
