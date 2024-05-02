package modelo;

public class Tradicional extends Aula {
	private int cantBancos;
	private String pizarron;
	private boolean tieneProyector;
	
	public Tradicional() {
	}
	
	public Tradicional(int numero, Edificio edificio, int cantBancos, String pizarron, boolean tieneProyector) {
		super(numero, edificio);
		this.setCantBancos(cantBancos);
		this.setPizarron(pizarron);
		this.setTieneProyector(tieneProyector);
	}

	public void setCantBancos(int cantBancos) {
		this.cantBancos = cantBancos;
	}
	
	public int getCantBancos() {
		return cantBancos;
	}
	
	public void setPizarron(String pizarron) {
		this.pizarron = pizarron;
	}
	
	public String getPizarron() {
		return pizarron;
	}
	
	public void setTieneProyector(boolean tieneProyector) {
		this.tieneProyector = tieneProyector;
	}
	
	public boolean isTieneProyector() {
		return tieneProyector;
	}

	@Override
	public boolean equals(Object obj) {
		Tradicional tradicional = (Tradicional) obj;
		return this.getIdAula() == tradicional.getIdAula();
	}

	@Override
	public String toString() {
		return "Tradicional [" + super.toString() + ", cantBancos=" + cantBancos + ", pizarron=" + pizarron
				+ ", tieneProyector=" + tieneProyector + "]";
	}
}
