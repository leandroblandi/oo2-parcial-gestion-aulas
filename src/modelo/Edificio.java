package modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Edificio {
	private int idEdificio;
	private String edificio;
	private Set<Aula> aulas = new HashSet<>();

	public Edificio() {
	}

	public Edificio(String edificio) {
		this.edificio = edificio;
	}

	public boolean agregarAula(Aula aula) {
		boolean agregado = false;
		if (!aulas.contains(aula)) {
			agregado = aulas.add(aula);
		}
		return agregado;
	}

	public boolean eliminarAula(Aula aula) {
		boolean eliminado = false;
		Iterator<Aula> aulasIterator = aulas.iterator();

		while (aulasIterator.hasNext() && !eliminado) {
			Aula aulaActual = aulasIterator.next();
			if (aula.equals(aulaActual)) {
				eliminado = aulas.remove(aulaActual);
			}
		}
		return eliminado;
	}

	public int getIdEdificio() {
		return idEdificio;
	}

	protected void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Set<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}

	@Override
	public boolean equals(Object obj) {
		Edificio edificio = (Edificio) obj;
		return this.idEdificio == edificio.getIdEdificio();
	}

	@Override
	public String toString() {
		return "Edificio [idEdificio=" + idEdificio + ", edificio=" + edificio + ", cantAulas=" + aulas.size() + "]";
	}
}
