package Bi_Tri_Estable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSemaforo {

	private Semaforo s;

	// Antes de cada test creamos un nuevo semaforo y en amarillo
	@BeforeEach
	void init() {
		
		s = new Semaforo(new Amarillo());
	}

	// Comprobamos el constructor
	@Test
	void testConstructor() {

		assertEquals("precaucion", s.estado());
		assertEquals("cerrado", new Semaforo(new Rojo()).estado());
		assertEquals("abierto", new Semaforo(new Verde()).estado());
		
		
	}

	// Comprobamos que el semaforo se abre y se ciera
	@Test
	void testAbreCierra() {

		s.cerrar();
		assertEquals("cerrado", s.estado());

		s.abrir();
		assertEquals("precaucion", s.estado());
		
		s.abrir();
		assertEquals("abierto", s.estado());
	}
	
	//Comprobamos que cambia correctamente de modo desde cualquier estado posible
	@Test
	void testCambio() {
		
		//De amarillo a verde biestable al abrir
		s.cambio();
		s.abrir();
		assertEquals("abierto", s.estado());
		
		//De verde biestable a verde triestable
		s.cambio();
		assertEquals("abierto", s.estado());
		
		//De rojo triestable a rojo biestable
		s.cerrar();
		s.cerrar();
		s.cambio();
		assertEquals("cerrado", s.estado());
		
		//De rojo biestable a triestable
		s.cambio();
		assertEquals("cerrado", s.estado());
		
	}
	
}
