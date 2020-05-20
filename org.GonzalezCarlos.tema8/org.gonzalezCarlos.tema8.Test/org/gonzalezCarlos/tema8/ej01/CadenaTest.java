package org.gonzalezCarlos.tema8.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest {

	@Test
	public void cDelante() {
		
		Cadena actual = new Cadena("Primer");

		actual.cDelante("Comentario");

		assertEquals("PrimerComentario", actual.getCadena(), "primer+comentario=PrimerComentario");
	}
	
	@Test
	public void cDetras01() {
		
		Cadena actual = new Cadena("Segundo");

		actual.cDetrás("Comentario");

		assertEquals("SegundoComentario", actual.getCadena(), "segundo+comentario=SegundoComentario");
	}
	
	@Test
	public void quitarChar() {

		Cadena actual = new Cadena("Hola que tal");

		actual.quitar('a');

		assertEquals(",", actual.getCadena());
	}
	
	public void quitarCharInt() {

		Cadena actual = new Cadena("H1la que tal");

		actual.quitar('h',1);

		assertEquals("H1la que tal", actual.getCadena());
	}

}
