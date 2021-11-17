package com.katherin.API2.service;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.repositorios.PartidosRepository;

public class PartidosService {
	
	@Autowired
	@Enumerated(EnumType.STRING)
	Ideologia ideologia;
	
	@Autowired
	private PartidosRepository partidosRepository;
	
	public List<PartidosDto> filtrandoIdeologias(Enum<Ideologia> ideologia) {

		if (ideologia == null) {
				
				List<Partidos> partidos = partidosRepository.findAll();
				return  PartidosDto.convertir(partidos);		
		
			}else { List<Partidos> partidos = partidosRepository.findByIdeologia(ideologia);
		return PartidosDto.convertir(partidos);
	}}
	

}
