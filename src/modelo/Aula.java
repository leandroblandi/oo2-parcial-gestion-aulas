package modelo;

import java.util.Objects;

public abstract class Aula {
	private int idAula;
	private int numero;
	private Edificio edificio;

	public Aula() {
	}

	public Aula(int numero, Edificio edificio) {
		this.numero = numero;
		this.edificio = edificio;
	}

	public int getIdAula() {
		return idAula;
	}

	protected void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edificio, idAula, numero);
	}

	@Override
	public boolean equals(Object obj) {
		Aula aula = (Aula) obj;
		return this.idAula == aula.getIdAula();
	}

	@Override
	public String toString() {
		return "idAula=" + idAula + ", numero=" + numero + ", edificio=" + edificio.getEdificio();
	}
}
