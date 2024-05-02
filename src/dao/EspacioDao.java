package dao;

import java.time.LocalDate;

import org.hibernate.HibernateException;

import dao.util.BaseDao;
import modelo.Aula;
import modelo.Espacio;

public class EspacioDao extends BaseDao {
	private static EspacioDao instancia;

	private EspacioDao() {
	}

	public static EspacioDao getInstancia() {
		if (instancia == null) {
			instancia = new EspacioDao();
		}
		return instancia;
	}

	public Espacio traer(LocalDate fecha, char turno, Aula aula, boolean libre) {
		Espacio espacio = null;
		try {
			iniciaOperacion();
			espacio = (Espacio) session.createQuery(
					"from Espacio e inner join fetch e.aula a inner join fetch a.edificio where e.fecha=:fecha and e.turno=:turno and e.aula.idAula=:idAula and e.libre=:libre")
					.setParameter("fecha", fecha).setParameter("turno", turno).setParameter("idAula", aula.getIdAula())
					.setParameter("libre", libre).uniqueResult();
		} finally {
			session.close();
		}
		return espacio;
	}

	public int agregar(Espacio espacio) {
		int id = 0;
		
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(espacio).toString());
		} catch (HibernateException e) {
			manejaExcepcion(e);
			throw e;
		} finally {
			session.close();
		}
		return id;
	}

	public void agregarEspacioMes(Espacio espacio) {
		LocalDate fechaComienzo = espacio.getFecha();
		for (int i = 1; i <= fechaComienzo.lengthOfMonth(); i++) {
			agregar(espacio);
			// Luego de guardar, sumo 1 dia, y seteo la fecha
			LocalDate fechaActual = fechaComienzo.plusDays(i);
			espacio.setFecha(fechaActual);
		}
	}
}
