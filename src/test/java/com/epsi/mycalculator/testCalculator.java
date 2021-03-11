package com.epsi.mycalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCalculator {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 2;
		int b = 7;
		Calculator calc = new Calculator();
		int res = calc.add(a,b);
		
		assertEquals(9, res);
		
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
	}

}
