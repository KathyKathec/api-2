package com.katherin.API2.controller;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.service.PartidosService;

@RestController
@RequestMapping ("/partidos")
public class PartidosController {
	
	@Autowired
	@Enumerated(EnumType.STRING)
	private Ideologia ideologia;

	@GetMapping
	public List<PartidosDto> lista(PartidosService service){
	return service.filtrandoIdeologias(ideologia);
}
	
	
}
