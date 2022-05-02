package biestable;

public class Verde implements Estado {
	
	public Verde() {
		
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
		Semaforo.setEstado(new Rojo());
	}
	

}
