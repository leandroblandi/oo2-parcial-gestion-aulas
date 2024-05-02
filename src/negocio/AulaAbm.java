package negocio;

import dao.AulaDao;
import modelo.Aula;

public class AulaAbm {
	private static AulaAbm instancia;
	private AulaDao aulaDao;

	private AulaAbm() {
		this.aulaDao = AulaDao.getInstancia();
	}

	public static AulaAbm getInstancia() {
		if (instancia == null) {
			instancia = new AulaAbm();
		}
		return instancia;
	}

	public Aula traer(int idAula) {
		return aulaDao.traer(idAula);
	}
}
