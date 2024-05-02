package test;

import dao.EdificioDao;
import modelo.Edificio;

public class EdificioAbmTest {
	private static EdificioDao edificioDao = EdificioDao.getInstancia();

	public static void main(String[] args) {

		// CU1
		Edificio edificio = edificioDao.traerEdificioConAulas(1);
		System.out.printf("\nCaso de Uso 1\n");
		System.out.printf("\n%s\n", edificio);
	}
}
