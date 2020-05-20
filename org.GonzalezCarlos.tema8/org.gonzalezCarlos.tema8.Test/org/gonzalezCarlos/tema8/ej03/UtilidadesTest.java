package org.gonzalezCarlos.tema8.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	
	private Utilidades utilidades;

	@BeforeEach
	public void setUp() {
		this.utilidades = new Utilidades();
	}

	@Test
	public void esPrimoPrimero() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(0), "El número 0 NO es primo");
	}

	@Test
	public void esPrimoSegundo() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1), "El número 1 NO es primo");
	}

	@Test
	public void esPrimoTercero() throws NumeroException {
		assertTrue(this.utilidades.esPrimo(999983), "El número 999983 SI es primo");
	}

	@Test
	public void esPrimoCuarto() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1000000), "1000000 NO es primo");
	}
	
	@Test
	public void esPrimoQuinto() throws NumeroException {
		assertThrows(NumeroException.class, () -> this.utilidades.esPrimo(-1), "El número -1 hace saltar NumeroException");
	}

	@Test
	public void esPrimoSexto() throws NumeroException {
		assertThrows(NumeroException.class, () -> this.utilidades.esPrimo(1000001),
				"1000001 hace saltar NumeroException");
	}

}
