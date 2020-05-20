package Refactorizar;

public class EjercicioRefactorizado {

	public static void main(String[] args) {

		new EjercicioRefactorizado().f();
		new EjercicioRefactorizado().refactorizacion();

	}

	private void encabezadoSuperior() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

	}

	private void encabezadoInferior() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

	private void separador() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void espaciado() {
		System.out.println();
		System.out.println();
	}

	// Primera parte de la separación. 
	private void f() {

		encabezadoSuperior();
		mostrarTitulo("TEMA 1. CONTROL DE VERSIONES");
		encabezadoInferior();

		mostrarTitulo("1. Conceptos Generales");
		separador();

		mostrarTitulo("2. Repositorio centralizado. SVN");
		separador();

		mostrarTitulo("3. Repositorio distribuido.GIT");
		encabezadoInferior();
		espaciado();
	}

	// Segunda parte de la separación
	private void refactorizacion() {

		encabezadoSuperior();
		mostrarTitulo("REFACTORIZACIÓN");
		encabezadoInferior();

		mostrarTitulo("1. Bad smells");
		separador();

		mostrarTitulo("Refactorizaciones habituales");
		separador();

		mostrarTitulo("Refactorizando con Eclipse");
		encabezadoInferior();
	}

	private void mostrarTitulo(String titulo) {
		System.out.println(titulo);

	}

}
