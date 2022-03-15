package br.com.testUnidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class NumberTest {
	
	@Test
	public void number2test() {
		Number number2 = new Number(2);
		assertEquals(true, number2.isPrime());
	}

	@Test
	public void number4test() {
		Number number4 = new Number(4);
		assertEquals(false, number4.isPrime());
	}

	@Test
	public void numberNegative3test() {
		Number numberNegative3 = new Number(4);
		assertEquals(false, numberNegative3.isPrime());
	}
	@Test
	public void number79test() {
		Number number2 = new Number(79);
		assertEquals(true, number2.isPrime());
	}
	
}
