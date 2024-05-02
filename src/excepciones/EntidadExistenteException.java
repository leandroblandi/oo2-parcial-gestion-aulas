package excepciones;

public class EntidadExistenteException extends Exception {
	private static final long serialVersionUID = 1L;

	public EntidadExistenteException(String mensaje) {
		super(mensaje);
	}
}
