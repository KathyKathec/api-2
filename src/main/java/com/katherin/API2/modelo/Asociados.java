package com.katherin.API2.modelo;

import java.util.Date;

public class Asociados {

	private int id;
	private String nome;
	
	private CargoPolitico cargo_politico;
	private Date data_nascimento;
	
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
