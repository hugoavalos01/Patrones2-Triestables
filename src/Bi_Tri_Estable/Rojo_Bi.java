package Bi_Tri_Estable;

public class Rojo_Bi implements Estado {
	
	public Rojo_Bi() {
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "cerrado";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Verde_Bi());
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Rojo());
	}

}
