package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void testPos() {
		System.out.println("Resta entornos");
		Resta s = new Resta (6,2);
		assertTrue(s.restar() == 4);
	}
	@Test
	public void testNeg() {
		System.out.println("Resta entornos");
		Resta s = new Resta (-6,-2);
		assertTrue(s.restar() == -4);
	}
	@Test
	public void testPosNeg() {
		System.out.println("Resta entornos");
		Resta s = new Resta (6,-2);
		assertTrue(s.restar() == 8);
	}

}
