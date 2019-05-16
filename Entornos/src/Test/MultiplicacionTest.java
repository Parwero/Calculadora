package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicacionTest {

	@Test
	public void testPos() {
		System.out.println("Multiplicación entornos");
		Multiplicacion s = new Multiplicacion (2,3);
		assertTrue(s.multiplicar() == 6);
	}
	@Test
	public void testNeg() {
		System.out.println("Multiplicación entornos");
		Multiplicacion s = new Multiplicacion (-2, -3);
		assertTrue(s.multiplicar() == 6);
	}
	@Test
	public void testPosNeg() {
		System.out.println("Multiplicación entornos");
		Multiplicacion s = new Multiplicacion (2, -3);
		assertTrue(s.multiplicar() == -6);
	}
	

}
