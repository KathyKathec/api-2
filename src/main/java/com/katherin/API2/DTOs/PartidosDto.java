package com.katherin.API2.DTOs;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;

public class PartidosDto {

	private String nome_partido;
	private String sigla;
	private Ideologia ideologia;
	private Date data_fundacao;
	
	
	
	public PartidosDto (Partidos partido) {
		
		this.data_fundacao = partido.getData_fundacao();
		this.nome_partido = partido.getNome_Partido();
		this.sigla = partido.getSigla();
		this.ideologia=partido.getIdeologia();
		

	}

	public String getNome_partido() {
		return nome_partido;
	}

	public void setNome_partido(String nome_partido) {
		this.nome_partido = nome_partido;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Ideologia getIdeologia() {
		return ideologia;
	}

	public void setIdeologia(Ideologia ideologia) {
		this.ideologia = ideologia;
	}

	public Date getData_fundacao() {
		return data_fundacao;
	}

	public void setData_fundacao(Date data_fundacao) {
		this.data_fundacao = data_fundacao;
	}
	
	public static List<PartidosDto> convertir(List<Partidos> partido){
		return partido.stream().map(PartidosDto::new).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
		
}
