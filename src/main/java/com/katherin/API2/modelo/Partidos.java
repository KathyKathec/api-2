package com.katherin.API2.modelo;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Partidos {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany
	private String nome_partido;
	private String sigla;
	@Enumerated(EnumType.STRING) 
	private Ideologia ideologia;
	private Date data_fundacao;

	
	
	
	
	public String getNome_Partido() {
		return nome_partido;
	}

	public void setNome_Partido(String nome_Partido) {
		this.nome_partido = nome_Partido;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Date getData_fundacao() {
		return data_fundacao;
	}

	public void setData_fundacao(Date data_fundacao) {
		this.data_fundacao = data_fundacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ideologia getIdeologia() {
		return ideologia;
	}

	public void setIdeologia(Ideologia ideologia) {
		this.ideologia = ideologia;
	}
	

	
	
	
	
}
