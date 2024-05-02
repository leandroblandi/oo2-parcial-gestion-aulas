package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Espacio {
	private int idEspacio;
	private LocalDate fecha;
	private Aula aula;
	private boolean libre;
	private char turno;
	
	public Espacio() {
	}

	public Espacio(LocalDate fecha, Aula aula, boolean libre, char turno) {
		this.setFecha(fecha);
		this.setAula(aula);
		this.setLibre(libre);
		this.setTurno(turno);
	}

	public int getIdEspacio() {
		return idEspacio;
	}

	protected void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public char getTurno() {
		return turno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aula, fecha, idEspacio, libre);
	}

	@Override
	public boolean equals(Object obj) {
		Espacio espacio = (Espacio) obj;
		return this.idEspacio == espacio.getIdEspacio();
	}

	@Override
	public String toString() {
		return "Espacio [idEspacio=" + idEspacio + ", fecha=" + fecha + ", aula=" + aula + ", libre=" + libre
				+ ", turno=" + turno + "]";
	}
}
