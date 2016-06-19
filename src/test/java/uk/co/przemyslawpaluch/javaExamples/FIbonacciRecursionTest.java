package uk.co.przemyslawpaluch.javaExamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.przemyslawpaluch.javaExamples.FibonacciRecursion;
import uk.co.przemyslawpaluch.javaExamples.Fibonacci;

/**
 * @author Przemyslaw Paluch
 */
public class FIbonacciRecursionTest {

	//Element from Fibonacci list
	@Test
	public void shouldReturnElementFromFibonacciList() {
		assertEquals( new Integer( 1 ), FibonacciRecursion.getFibonacciNumberElement( 1 ));
		assertEquals( new Integer( 1 ), FibonacciRecursion.getFibonacciNumberElement( 2 ));
		assertEquals( new Integer( 5 ), FibonacciRecursion.getFibonacciNumberElement( 5 ));
		assertEquals( new Integer( 55 ), FibonacciRecursion.getFibonacciNumberElement( 10 ));
		assertEquals( new Integer( 233 ), FibonacciRecursion.getFibonacciNumberElement( 13 ));
		assertEquals( new Integer( 610 ), FibonacciRecursion.getFibonacciNumberElement( 15 ));
		assertEquals( new Integer( 4181 ), Fibonacci.getFibonacciNumberElement( 19 ));
	}
}
