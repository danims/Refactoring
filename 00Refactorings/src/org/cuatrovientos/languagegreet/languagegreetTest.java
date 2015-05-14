package org.cuatrovientos.languagegreet;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Daniel Martin
 * test class for languagegreet
 *
 */
public class languagegreetTest {

	@Test
	public void testGreetMethod() {
		languagegreet myGreet = new languagegreet();

		String expected = "hola";
		String target = myGreet.greet(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = myGreet.greet(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = myGreet.greet(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
