package com.katherin.API2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.katherin.API2.DTOs.PartidosDto;
import com.katherin.API2.controller.PartidosController;
import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.service.PartidosService;

class PartidosServiceTest {

	@Test
	public void testandoSePossoFiltrarOsPartidosComAIdeologia () {
		PartidosService service = new PartidosService ();
		PartidosController controller = new PartidosController();
		Ideologia ideologia ;
	
		service.filtrandoIdeologias(Ideologia.Centro );
		List<Partidos> partidos;
	//	assert.assertArrayEquals(PartidosDto.convertir(partidos), null);
	}

}
