package modelo;

public class Laboratorio extends Aula {
	private int cantPC;
	private int cantSillas;

	public Laboratorio() {
	}

	public Laboratorio(int numero, Edificio edificio, int cantPC, int cantSillas) {
		super(numero, edificio);
		this.setCantPC(cantPC);
		this.setCantSillas(cantSillas);
	}

	public void setCantPC(int cantPC) {
		this.cantPC = cantPC;
	}

	public int getCantPC() {
		return cantPC;
	}

	public void setCantSillas(int cantSillas) {
		this.cantSillas = cantSillas;
	}

	public int getCantSillas() {
		return cantSillas;
	}

	@Override
	public boolean equals(Object obj) {
		Laboratorio laboratorio = (Laboratorio) obj;
		return this.getIdAula() == laboratorio.getIdAula();
	}

	@Override
	public String toString() {
		return "Laboratorio [" + super.toString() + ", cantPC=" + cantPC + ", cantSillas=" + cantSillas + "]";
	}
}
