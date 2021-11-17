package com.katherin.API2.form;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.repositorios.PartidosRepository;

public class PartidosForm {

	@NotNull @NotEmpty @Length (min =8)
	private Date data_fundacao;
	@Enumerated(EnumType.STRING) @NotEmpty @NotNull
	private Ideologia ideologia;
	@NotNull @NotEmpty @Length (min = 10)
	private String nome_partido;
	@NotEmpty @NotNull @Length (max=6)
	private String sigla;
	
	public Partidos convertir(PartidosRepository partidosRepository) {
		Partidos partidos = (Partidos) partidosRepository.findAll();
		return new Partidos(nome_partido, sigla, ideologia, data_fundacao);
	}
	public Partidos reemplaza(int id, PartidosRepository partidosRepository) {
		Partidos partidos = partidosRepository.getById(id);
		partidos.setData_fundacao(this.data_fundacao);
		partidos.setIdeologia(this.ideologia);
		partidos.setNome_Partido(this.nome_partido);
		partidos.setSigla(this.sigla);
		
		return partidos;
}
}