package com.katherin.API2.controller;

import java.net.URI;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.repositorios.PartidosRepository;
import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.form.PartidosForm;
import com.katherin.API2.service.PartidosService;

@RestController
@RequestMapping ("/partidos")
public class PartidosController {
	
	private static final URI URI = null;

	@Autowired(required=true)
	@Enumerated(EnumType.STRING)
	private Ideologia ideologia;
	
	@Autowired
	private PartidosRepository partidosRepository;
//	
//	@GetMapping
//	public List<PartidosDto> lista(Ideologia ideologia){
//	 List<Partidos> partidos =  PartidosService.convertir(partidos) ;
//	 return  ((PartidosService) partidos).filtrandoIdeologias(ideologia); 
//	
//	
//	}}

//public List<PartidosDto> filtrandoIdeologias(Enum<Ideologia> ideologia) {
//
//	if (ideologia == null) {
//			
//			List<Partidos> partidos = partidosRepository.findAll();
//			return  PartidosDto.convertir(partidos);		
//	
//		}else { List<Partidos> partidos = partidosRepository.findByIdeologia(ideologia);
//	return PartidosDto.convertir(partidos);

	@PostMapping ("/partidos")
	public ResponseEntity<PartidosDto> insere(@RequestBody @Valid PartidosForm form) {
		Partidos partido = form.convertir(partidosRepository);
		partidosRepository.save(partido);
		Partidos partidos = new Partidos();
		return ResponseEntity.created(URI).body( new PartidosDto(partidos));
	}

}

