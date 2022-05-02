package Bi_Tri_Estable;

public class Verde_Bi implements Estado {
	
	public Verde_Bi() {
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "abierto";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Rojo_Bi());
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Verde());
	}

}
