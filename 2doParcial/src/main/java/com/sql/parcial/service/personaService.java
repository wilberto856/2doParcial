package com.sql.parcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sql.parcial.entity.Persona;
import com.sql.parcial.repository.PersonaRepository;

@Service
public class personaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public Persona savePersona(Persona persona) {
		return personaRepository.save(persona);
	}
	
	public List<Persona> getPersonas(){
		return personaRepository.findAll();
	}
	
}
