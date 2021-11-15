package com.katherin.API2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.katherin.API2.modelo.Ideologia;
import com.katherin.API2.modelo.Partidos;
import com.katherin.API2.service.PartidosService;

class PartidosServiceTest {

	@Test
	public void testandoSePossoFiltrarOsPartidosComAIdeologia () {
		PartidosService service = new PartidosService ();
		//Partidos partido = new Partidos ();
		
		service.filtrandoIdeologias(Ideologia.Centro );
	
	}

}
