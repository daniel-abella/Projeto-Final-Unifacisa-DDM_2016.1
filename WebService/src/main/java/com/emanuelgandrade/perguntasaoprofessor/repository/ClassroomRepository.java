package com.emanuelgandrade.perguntasaoprofessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelgandrade.perguntasaoprofessor.domain.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

	public Classroom findByName(String name);

}
