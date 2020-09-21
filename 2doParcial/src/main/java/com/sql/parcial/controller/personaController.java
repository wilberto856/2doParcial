package com.sql.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sql.parcial.entity.Persona;
import com.sql.parcial.service.personaService;

@RestController
@CrossOrigin
public class personaController {

	@Autowired
	private personaService personaService;
	
	@PostMapping("/addpersona")
	public Persona addPersona(@RequestBody Persona persona) {
		return personaService.savePersona(persona);
	}
	
	@GetMapping("/getpersonas")
	public List<Persona> getPersonas(){
		return personaService.getPersonas();
	}
	
}
