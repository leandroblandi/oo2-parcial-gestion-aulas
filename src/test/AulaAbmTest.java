package test;

import dao.AulaDao;
import modelo.Aula;

public class AulaAbmTest {
	private static AulaDao aulaDao = AulaDao.getInstancia();

	public static void main(String[] args) {
		// CU2
		Aula aula = aulaDao.traer(5);
		System.out.printf("\nCaso de Uso 2\n");
		System.out.printf("\n%s\n", aula);
	}
}
