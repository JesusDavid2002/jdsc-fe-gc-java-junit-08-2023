package EjerciciosTA30.JUnit_Geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSuma() {
		int resultado = App.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = App.resta(5, 3);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
}
