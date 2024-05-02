package test;

import java.time.LocalDate;

import modelo.Aula;
import modelo.Espacio;
import negocio.AulaAbm;
import negocio.EspacioAbm;

public class EspacioAbmTest {
	private static EspacioAbm espacioAbm = EspacioAbm.getInstancia();
	private static AulaAbm aulaAbm = AulaAbm.getInstancia();

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2022, 5, 1);
		char turno = 'M';
		Aula aula = aulaAbm.traer(5);

		// CU3
		Espacio espacio = espacioAbm.traer(fecha, turno, aula);
		System.out.printf("\nCaso de uso 3\n");
		System.out.printf("\n%s\n", espacio);

		// CU4
		int id = 0;
		try {
			id = espacioAbm.agregar(fecha, turno, aula, true);
			System.out.printf("\nCaso de Uso 4\n");
			System.out.printf("\nID del objeto guardado: %d\n", id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// CU5
		int mes = 6;
		int anio = 2024;
		aula = aulaAbm.traer(3);
		boolean libre = true;
		espacioAbm.agregarEspacioMes(mes, anio, turno, aula, libre);
	}
}
