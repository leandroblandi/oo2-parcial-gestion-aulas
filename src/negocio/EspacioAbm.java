package negocio;

import java.time.LocalDate;

import dao.EspacioDao;
import excepciones.EntidadExistenteException;
import modelo.Aula;
import modelo.Espacio;

public class EspacioAbm {
	private static EspacioAbm instancia;
	private EspacioDao espacioDao;

	private EspacioAbm() {
		this.espacioDao = EspacioDao.getInstancia();
	}

	public static EspacioAbm getInstancia() {
		if (instancia == null) {
			instancia = new EspacioAbm();
		}
		return instancia;
	}

	public Espacio traer(LocalDate fecha, char turno, Aula aula) {
		return espacioDao.traer(fecha, turno, aula, true);
	}

	public int agregar(LocalDate fecha, char turno, Aula aula, boolean libre) throws EntidadExistenteException {
		Espacio espacioExistente = traer(fecha, turno, aula);

		if (espacioExistente != null) {
			throw new EntidadExistenteException("El espacio ya existe en la BBDD");
		}

		Espacio espacio = new Espacio(fecha, aula, libre, turno);
		return espacioDao.agregar(espacio);
	}

	public void agregarEspacioMes(int mes, int anio, char turno, Aula aula, boolean libre) {
		LocalDate fecha = LocalDate.of(anio, mes, 1);
		Espacio espacio = new Espacio(fecha, aula, true, turno);
		espacioDao.agregarEspacioMes(espacio);
	}
}
