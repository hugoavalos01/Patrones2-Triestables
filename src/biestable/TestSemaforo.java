package biestable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSemaforo {

	private Semaforo s;

	// Antes de cada test creamos un nuevo semaforo y en verde
	@BeforeEach
	void init() {
		
		s = new Semaforo(new Verde());
	}

	// Comprobamos el constructor
	@Test
	void testConstructor() {

		assertEquals("abierto", s.estado());
		assertEquals("cerrado", new Semaforo(new Rojo()).estado());
	}

	// Comprobamos que el semaforo se abre y se cierra
	@Test
	void testCambio() {

		s.cerrar();
		assertEquals("cerrado", s.estado());

		s.abrir();
		assertEquals("abierto", s.estado());
	}
}
