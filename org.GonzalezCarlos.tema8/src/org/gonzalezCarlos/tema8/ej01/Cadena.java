package org.gonzalezCarlos.tema8.ej01;

public class Cadena {
	
	private String cadena;
	
	public Cadena(String cadena) {
		super();
		this.cadena = cadena;
	}

	public void cDelante(String b) {

		this.cadena = cadena + this.cadena;
		
	}
	
	public String getCadena() {
		return cadena;
	}

	public void cDetrás(String c) {
		
		this.cadena = cadena + this.cadena;

	}

	public void quitar(char c) {

	}

	public void quitar(char c, int n) {
		
	}
	
}
