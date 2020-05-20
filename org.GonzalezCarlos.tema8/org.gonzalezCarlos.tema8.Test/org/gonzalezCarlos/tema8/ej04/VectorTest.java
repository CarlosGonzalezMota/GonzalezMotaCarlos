package org.gonzalezCarlos.tema8.ej04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VectorTest {
	
	private Vector vector;

	@BeforeEach
	public void setUp() {
		this.vector = new Vector();
	}
	
	@Test
	public void ordenarPrimero() throws InputDataException{
	
		int[] primeraArray = {30,20,10,1};
		int[] segundaArray = {2,4,6,8};
		int[] resultadoFinal = this.vector.ordenar(primeraArray);
		
		assertArrayEquals(segundaArray, resultadoFinal, "arrays iguales");
	}
	
	@Test
	public void ordenarSegundo() throws InputDataException{
	
		int[] primeraArray = null;
		
		assertThrows(InputDataException.class, ()->this.vector.ordenar(primeraArray));
	}
	
	@Test
	public void ordenarTercero() throws InputDataException{
	
		int[] primeraArray = {};
		
		assertThrows(InputDataException.class, ()->this.vector.ordenar(primeraArray));
	}
	
	@Test
	public void ordenarCuarto() throws InputDataException{

		int[] primeraArray = new int[5000];
		for(int a=0; a<5000; a++) {
			primeraArray[a] = a;
		}

		assertThrows(InputDataException.class, ()->this.vector.ordenar(primeraArray));
	}

}
