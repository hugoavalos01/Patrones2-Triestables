package triestable;

public class Amarillo implements Estado {
	
	public Amarillo() {
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "precaucion";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Verde());
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		Semaforo.setEstado(new Rojo());
	}
	
	
}
