package Bi_Tri_Estable;

public class Transicion implements Estado{
	
	public Transicion() {
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "precaucion";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Verde_Bi());
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Rojo_Bi());
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		
	}

}
