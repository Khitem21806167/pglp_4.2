package pglp4_2;
import Exceptions.*;
import pglp_4_2.pglp4_2.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperation {


private Operation opr;
	
	/*
	 * test la constante Plus de la classe Operation
	 */
	@Test
	public void testPlus() throws DivisionparZeroException {
		opr= Operation.PLUS;
		boolean test=(opr.eval(150,700)==850.0);
		assertEquals(test,true);
	}
	/*
	 * test la constante Moins de la classe Operation
	 */
	@Test
	public void testMoins() throws DivisionparZeroException {
		opr= Operation.MOINS;
		boolean test=(opr.eval(2,3)==1.0);
		assertEquals(test,false);
	}
	/**
	 * test la constante Mult de la classe Operation
	 */
	@Test
	public void testMult() throws DivisionparZeroException {
		opr= Operation.MULT;
		boolean test=(opr.eval(95,1)==95.0);
		assertEquals(test,true);
	}
	/**
	 * test la constante Div de la classe Operation
	 */
	@Test
	public void testDiv() throws DivisionparZeroException {
		opr= Operation.DIV;
		boolean test=(opr.eval(2,3)==1.5);
		assertEquals(test,false);
	}
	
	
}
