package com.katherin.API2.controller;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.repositorios.PartidosRepository;
import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.service.PartidosService;

@RestController
@RequestMapping ("/partidos")
public class PartidosController {
	
	@Autowired(required=true)
	@Enumerated(EnumType.STRING)
	private Ideologia ideologia;
	
	@Autowired
	private PartidosRepository partidosRepository;
	
	@GetMapping
	public List<PartidosDto> filtrandoIdeologias(Enum<Ideologia> ideologia) {

		if (ideologia == null) {
				
				List<Partidos> partidos = partidosRepository.findAll();
				return  PartidosDto.convertir(partidos);		
		
			}else { List<Partidos> partidos = partidosRepository.findByIdeologia(ideologia);
		return PartidosDto.convertir(partidos);
	
	
	
//	public List<PartidosDto> lista(PartidosService service){
//	return service.filtrandoIdeologias(ideologia);
}
	
	
	}}	

