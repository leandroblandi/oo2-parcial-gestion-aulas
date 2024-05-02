package dao;

import org.hibernate.Hibernate;

import dao.util.BaseDao;
import modelo.Aula;

public class AulaDao extends BaseDao {
	private static AulaDao instancia;

	private AulaDao() {
	}

	public static AulaDao getInstancia() {
		if (instancia == null) {
			instancia = new AulaDao();
		}
		return instancia;
	}

	public Aula traer(int idAula) {
		Aula aula = null;
		try {
			iniciaOperacion();
			aula = (Aula) session.createQuery("from Aula a join fetch a.edificio where a.idAula =:idAula")
					.setParameter("idAula", idAula)
					.uniqueResult();
			Hibernate.initialize(aula.getEdificio());
		} finally {
			session.close();
		}
		return aula;
	}
}
