package uk.co.przemyslawpaluch.javaExamples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uk.co.przemyslawpaluch.javaExamples.Fibonacci;

/**
 * @author Przemyslaw Paluch
 */
public class FibonacciTest {
	private static final Integer TILL_VALUE = 200;
	
	//Element from Fibonacci list
	@Test
	public void shouldReturnElementFromFibonacciList() {
		assertEquals( new Integer( 1 ), Fibonacci.getFibonacciNumberElement( 1 ));
		assertEquals( new Integer( 1 ), Fibonacci.getFibonacciNumberElement( 2 ));
		assertEquals( new Integer( 5 ), Fibonacci.getFibonacciNumberElement( 5 ));
		assertEquals( new Integer( 55 ), Fibonacci.getFibonacciNumberElement( 10 ));
		assertEquals( new Integer( 233 ), Fibonacci.getFibonacciNumberElement( 13 ));
		assertEquals( new Integer( 610 ), Fibonacci.getFibonacciNumberElement( 15 ));
		assertEquals( new Integer( 4181 ), Fibonacci.getFibonacciNumberElement( 19 ));
	}
	
	//Elements from Fibonacci list
	@Test
	public void shouldReturnElementsFromFibonacciList() {
		java.util.List< Integer > fibonacciList = Fibonacci.getFibonacciNumbersElements( 5 );
		assertEquals( 5, fibonacciList.size() );
		assertEquals( new Integer( 1 ), fibonacciList.get( 0 ) );
		assertEquals( new Integer( 1 ), fibonacciList.get( 1 ) );
		assertEquals( new Integer( 2 ), fibonacciList.get( 2 ) );
		assertEquals( new Integer( 3 ), fibonacciList.get( 3 ) );
		assertEquals( new Integer( 5 ), fibonacciList.get( 4 ) );
	}
	
	//Fibonacci list below max value
	@Test
	public void shouldReturnElementsFromFibonacciListBelowMaxValue() {
		java.util.List< Integer > fibonacciList = Fibonacci.getFibonacciNumbersTill( TILL_VALUE );
		assertEquals( 12, fibonacciList.size() );
		assertEquals( new Integer( 1 ), fibonacciList.get( 0 ) );
		assertEquals( new Integer( 1 ), fibonacciList.get( 1 ) );
		assertEquals( new Integer( 2 ), fibonacciList.get( 2 ) );
		assertEquals( new Integer( 8 ), fibonacciList.get( 5 ) );
		assertEquals( new Integer( 55 ), fibonacciList.get( 9 ) );
		assertEquals( new Integer( 89 ), fibonacciList.get( 10 ) );

		assertTrue( fibonacciList.get( 10 ) < TILL_VALUE );
	}
}
