package com.katherin.API2.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.repositorios.PartidosRepository;

public class PartidosService {
	
	private PartidosRepository partidosRepository;
	
	public List<PartidosDto> filtrandoIdeologias(Ideologia ideologia) {

		if (ideologia == null) {
				
				List<Partidos> partidos = partidosRepository.findAll();
				return  PartidosDto.convertir(partidos);		
		
			}else { List<Partidos> partidos = partidosRepository.findByIdeologia(ideologia);
		return PartidosDto.convertir(partidos);
	}}
	

}
