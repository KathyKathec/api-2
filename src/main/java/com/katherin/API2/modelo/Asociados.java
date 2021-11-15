package com.katherin.API2.modelo;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Asociados {

	private int id;
	private String nome;
	@Enumerated(EnumType.STRING) 
	private CargoPolitico cargo_politico;
	private Date data_nascimento;
	@Enumerated(EnumType.STRING) 
	private Sexo sexo;
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
	
	
	
	
	
	
	
	
	
}