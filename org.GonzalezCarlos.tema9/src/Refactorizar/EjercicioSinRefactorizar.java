package Refactorizar;

public class EjercicioSinRefactorizar {

	public static void main(String[] args) {
		new EjercicioSinRefactorizar().f();
	}

	// Pintar título, cuerpo y final
	private void f() {

		// Raya encabezado superior
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

		System.out.println("TEMA 1. CONTROL de VERSIONES");

		// Raya encabezado inferior
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

		System.out.println("1. Conceptos generales");

		// Separador
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Separador
		System.out.println("2. Repositorio centralizado. SVN");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Separador
		System.out.println("3. Repositorio distribuido. GIT");

		// Raya footer
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

		// =============================================
		System.out.println();
		System.out.println();
		// =============================================

		// Raya encabezado superior
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

		System.out.println("REFACTORIZACIÓN");

		// Raya encabezado inferior
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

		System.out.println("1. Bad smells");

		// Separador
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Separador
		System.out.println("2. Refactorizaciones habituales");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Separador
		System.out.println("3. Refactorizando con Eclipse");

		// Raya footer
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

	}
}
