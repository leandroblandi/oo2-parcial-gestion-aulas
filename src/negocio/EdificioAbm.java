package negocio;

import dao.EdificioDao;
import modelo.Edificio;

public class EdificioAbm {

	private static EdificioAbm instancia;
	private EdificioDao edificioDao;

	private EdificioAbm() {
		this.edificioDao = EdificioDao.getInstancia();
	}

	public static EdificioAbm getInstancia() {
		if (instancia == null) {
			instancia = new EdificioAbm();
		}
		return instancia;
	}

	public Edificio traerEdificioConAulas(int idEdificio) {
		return edificioDao.traerEdificioConAulas(idEdificio);
	}
}
