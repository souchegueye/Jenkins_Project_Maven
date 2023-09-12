package com.momo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	private final Calculator calc = new Calculator();

	@Test

	public void addTest() {
		assertEquals(10, calc.add(4, 6));
	}

}
