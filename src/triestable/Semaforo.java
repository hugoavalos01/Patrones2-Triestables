package triestable;

public class Semaforo {
	
	private static Estado estado;
	
	public Semaforo(Estado e) {
		estado = e;
	}
	
	public void abrir() {
		estado.abrir();
	}
	
	public void cerrar() {
		estado.cerrar();
	}
	
	public static void setEstado(Estado e) {
		estado = e;
	}
	
	public String estado() {
		return estado.estado();
	}
}
