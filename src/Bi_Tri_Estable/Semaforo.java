package Bi_Tri_Estable;

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
	
	public void cambio() {
		estado.cambio();
	}
	
	public static void setEstado(Estado e) {
		estado = e;
	}
	
	public String estado() {
		return estado.estado();
	}
}
