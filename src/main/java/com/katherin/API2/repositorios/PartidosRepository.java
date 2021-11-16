package com.katherin.API2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;

public interface PartidosRepository extends JpaRepository<Partidos, Integer> {

	List<Partidos> findByIdeologia(Enum<Ideologia> ideologia);
}
