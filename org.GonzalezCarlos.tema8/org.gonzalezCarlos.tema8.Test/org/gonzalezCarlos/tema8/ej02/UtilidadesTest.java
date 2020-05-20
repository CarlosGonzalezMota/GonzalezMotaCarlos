package org.gonzalezCarlos.tema8.ej02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilidadesTest {

private Utilidades utils;
	
	@BeforeEach
	public void setUp() {
		this.utils = new Utilidades();
	}
	
	@Test
	public void esFinDeSemanaPrimero() throws FechaException {		
		assertTrue(this.utils.esFinDeSemana(31,10,2020));

	}
	
	@Test
	public void esFinDeSemanaSegundo() throws FechaException {		
		assertFalse(this.utils.esFinDeSemana(21,01,2019));

	}
		
	@Test
	public void esFinDeSemanaCuarto() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,1900));

	}
	
	@Test
	public void esFinDeSemanaQuinto() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,3000));

	}
	
	@Test
	public void esFinDeSemanaSexto() throws FechaException {
		assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(15,03,1809));

	}
	
	@Test
	public void esFinDeSemanaSeptimo() throws FechaException {		
		assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(19,02,3010));
	}

}


