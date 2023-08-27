package EjerciciosTA30.JUnit_Geometria;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GeometriaTest {

	Geometria geo;

	@BeforeEach
	public void before() {
		geo = new Geometria();
	}
	
	@AfterEach
	public void after() {
		geo = new Geometria(geo.getId(), geo.getNom());
	}
	
	//Area cuadrado
	@Test
	public void testAreaCuadrado() {
		geo.figura(1);
		int resultado = geo.areaCuadrado(4);
		int esperado = 16;
		assertEquals(esperado, resultado);
	}
	
	//Area circulo
	@Test
	public void testAreaCirculo() {
		geo.figura(2);
		double resultado = geo.areaCirculo(2);
		Double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}
	
	//Area triangulo
	@Test
	public void testAreaTriangulo() {
		geo.figura(3);
		int resultado = geo.areaTriangulo(2, 5);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	//Area rectangulo
	@Test
	public void testAreaRectangulo() {
		geo.figura(4);
		int resultado = geo.areaRectangulo(2, 5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	
	//Area pentagono
	@Test
	public void testAreaPentagono() {
		geo.figura(5);
		int resultado = geo.areaPentagono(2, 5);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	//Area rombo
	@Test
	public void testAreaRombo() {
		geo.figura(6);
		int resultado = geo.areaRombo(2, 5);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	//Area romboide
	@Test
	public void testAreaRomboide() {
		geo.figura(7);
		int resultado = geo.areaRomboide(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	//Area trapecio
	@Test
	public void testAreaTrapecio() {
		geo.figura(8);
		int resultado = geo.areaTrapecio(2, 2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	//Area default
	@Test
	public void testDefault() {
		geo.figura(0);
	}
	
	//Get id
	@Test
	public void testGetID() {
		geo.getId();
	}
	
	//Set id
	@Test
	public void testSetID() {
		geo.setId(0);
	}
	
	//Get nombre
	@Test
	public void testGetNombre() {
		geo.getNom();
	}
	
	//Set nombre
	@Test
	public void testSetNombre() {
		geo.setNom("Prueba");
	}
	
	//ToString
		@Test
		public void testToString() {
			geo.toString();
		}
}

