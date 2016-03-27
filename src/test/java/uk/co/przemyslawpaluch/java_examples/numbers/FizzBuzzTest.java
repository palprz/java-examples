package uk.co.przemyslawpaluch.java_examples.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Przemyslaw Paluch
 */
public class FizzBuzzTest {
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";
	private final static String FIZZ_BUZZ = "FizzBuzz";

	@Test
	public void shouldEqualNumberString() {
		assertEquals( "1", FizzBuzz.fizzBuzz( 1 ) );
		assertEquals( "2", FizzBuzz.fizzBuzz( 2 ) );
		assertEquals( "7", FizzBuzz.fizzBuzz( 7 ) );
		assertEquals( "23", FizzBuzz.fizzBuzz( 23 ) );
	}
	
	@Test
	public void shouldEqualFizz() {
		assertEquals( FIZZ, FizzBuzz.fizzBuzz( 3 ) );
		assertEquals( FIZZ, FizzBuzz.fizzBuzz( 6 ) );
		assertEquals( FIZZ, FizzBuzz.fizzBuzz( 33 ) );
		assertEquals( FIZZ, FizzBuzz.fizzBuzz( 99 ) );
	}
	
	@Test
	public void shouldEqualBuzz() {
		assertEquals( BUZZ, FizzBuzz.fizzBuzz( 5 ) );
		assertEquals( BUZZ, FizzBuzz.fizzBuzz( 10 ) );
		assertEquals( BUZZ, FizzBuzz.fizzBuzz( 50 ) );
		assertEquals( BUZZ, FizzBuzz.fizzBuzz( 110 ) );		
	}
	
	@Test
	public void shouldEqualFizzBuzz() {
		assertEquals( FIZZ_BUZZ, FizzBuzz.fizzBuzz( 15 ) );
		assertEquals( FIZZ_BUZZ, FizzBuzz.fizzBuzz( 30 ) );
		assertEquals( FIZZ_BUZZ, FizzBuzz.fizzBuzz( 60 ) );
		assertEquals( FIZZ_BUZZ, FizzBuzz.fizzBuzz( 105 ) );
	}
}
