package Bi_Tri_Estable;

public class Rojo implements Estado {
	
	public Rojo() {
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "cerrado";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Amarillo());
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Rojo_Bi());
	}

}
