package biestable;

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
		Semaforo.setEstado(new Verde());
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub

	}

}
