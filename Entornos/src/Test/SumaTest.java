package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	
	@Test
	public void testPos() {
		System.out.println("Suma entornos");
		Suma s = new Suma (2,3);
		assertTrue(s.sumar() == 5);
	}
	@Test
	public void testNeg() {
		System.out.println("Suma entornos");
		Suma s = new Suma (-2,-6);
		assertTrue(s.sumar() == -8);
	}
	@Test
	public void testPosNeg() {
		System.out.println("Suma entornos");
		Suma s = new Suma (2,-6);
		assertTrue(s.sumar() == -4);
	}
	

}
