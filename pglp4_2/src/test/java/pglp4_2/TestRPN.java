package pglp4_2;
import pglp_4_2.pglp4_2.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class TestRPN {
	
	@Before()
	public void setUp() {}
	
	@Test()
	public void testLogStr() {
		Interpreteur i = new Interpreteur();
		i.liste("HELLO");
		assertEquals("HELLO", i.recupFin());
	}
}
