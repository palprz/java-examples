package uk.co.przemyslawpaluch.java_examples.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Przemyslaw Paluch
 */
public class FIbonacciWithRecursionTest {

	//Element from Fibonacci list
	@Test
	public void shouldReturnElementFromFibonacciList() {
		assertEquals( new Integer( 1 ), FibonacciWithRecursion.getFibonacciNumberElement( 1 ));
		assertEquals( new Integer( 1 ), FibonacciWithRecursion.getFibonacciNumberElement( 2 ));
		assertEquals( new Integer( 5 ), FibonacciWithRecursion.getFibonacciNumberElement( 5 ));
		assertEquals( new Integer( 55 ), FibonacciWithRecursion.getFibonacciNumberElement( 10 ));
		assertEquals( new Integer( 233 ), FibonacciWithRecursion.getFibonacciNumberElement( 13 ));
		assertEquals( new Integer( 610 ), FibonacciWithRecursion.getFibonacciNumberElement( 15 ));
		assertEquals( new Integer( 4181 ), FibonacciWithoutRecursion.getFibonacciNumberElement( 19 ));
	}
}
