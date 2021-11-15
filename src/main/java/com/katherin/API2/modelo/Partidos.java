package com.katherin.API2.modelo;
import java.util.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Partidos {

	private int id;
	private String nome_Partido;
	private String sigla;
	@Enumerated(EnumType.STRING) 
	private Ideologia ideologia;
	private Date data_fundacao;

	
	
	
	
	public String getNome_Partido() {
		return nome_Partido;
	}

	public void setNome_Partido(String nome_Partido) {
		this.nome_Partido = nome_Partido;
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

	
	
	
	
}
