package br.com.testUnidade;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void meuPrimeiroTest() {
		Person person = new Person();
		assertEquals("hello", person.hello());
	}

}
