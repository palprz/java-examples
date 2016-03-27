package uk.co.przemyslawpaluch.java_examples.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Przemyslaw Paluch
 */
public class FizzBuzzTest {

	@Test
	public void shouldEqualNumberString() {
		assertEquals( "1", FizzBuzz.fizzBuzz( 1 ) );
		assertEquals( "2", FizzBuzz.fizzBuzz( 2 ) );
		assertEquals( "7", FizzBuzz.fizzBuzz( 7 ) );
		assertEquals( "23", FizzBuzz.fizzBuzz( 23 ) );
	}
	
	@Test
	public void shouldEqualFizz() {
		assertEquals( "Fizz", FizzBuzz.fizzBuzz( 3 ) );
		assertEquals( "Fizz", FizzBuzz.fizzBuzz( 6 ) );
		assertEquals( "Fizz", FizzBuzz.fizzBuzz( 33 ) );
		assertEquals( "Fizz", FizzBuzz.fizzBuzz( 99 ) );
	}
	
	@Test
	public void shouldEqualBuzz() {
		assertEquals( "Buzz", FizzBuzz.fizzBuzz( 5 ) );
		assertEquals( "Buzz", FizzBuzz.fizzBuzz( 10 ) );
		assertEquals( "Buzz", FizzBuzz.fizzBuzz( 50 ) );
		assertEquals( "Buzz", FizzBuzz.fizzBuzz( 110 ) );		
	}
	
	@Test
	public void shouldEqualFizzBuzz() {
		assertEquals( "FizzBuzz", FizzBuzz.fizzBuzz( 15 ) );
		assertEquals( "FizzBuzz", FizzBuzz.fizzBuzz( 30 ) );
		assertEquals( "FizzBuzz", FizzBuzz.fizzBuzz( 60 ) );
		assertEquals( "FizzBuzz", FizzBuzz.fizzBuzz( 105 ) );
	}
}
