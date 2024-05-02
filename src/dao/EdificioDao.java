package dao;

import org.hibernate.Hibernate;

import dao.util.BaseDao;
import modelo.Edificio;

public class EdificioDao extends BaseDao {

	private static EdificioDao instancia;

	private EdificioDao() {
	}

	public static EdificioDao getInstancia() {
		if (instancia == null) {
			instancia = new EdificioDao();
		}
		return instancia;
	}

	public Edificio traerEdificioConAulas(int idEdificio) {
		iniciaOperacion();
		Edificio edificio = null;
		try {
			edificio = (Edificio) session.createQuery("from Edificio e where e.idEdificio =:idEdificio")
					.setParameter("idEdificio", idEdificio).uniqueResult();
			Hibernate.initialize(edificio.getAulas());
		} finally {
			session.close();
		}
		return edificio;
	}
}
