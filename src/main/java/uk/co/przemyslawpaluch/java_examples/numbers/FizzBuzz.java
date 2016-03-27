package uk.co.przemyslawpaluch.java_examples.numbers;

/**
 * <h2>FizzBuzz</h2>
 * Program that prints all the numbers from 1 to 100:<br/>
 * - for multiples of 3, instead of the number, print "Fizz",<br/> 
 * - for multiples of 5, instead of the number, print "Buzz",<br/>
 * - for numbers which are multiples of both 3 and 5, instead of the number, print "FizzBuzz".<br/>
 * 
 * @author Przemyslaw Paluch
 */
public class FizzBuzz {

	public static void main(String[] args) {
		for ( Integer i = 1; i <=100; i++ ) {
			System.out.println( fizzBuzz( i ) );
		}		
	}

	public static String fizzBuzz( Integer i ) {
		if ( i % ( 3 * 5 ) == 0 ) {
			return "FizzBuzz";
		} else if ( i % 3 == 0 ) {
			return "Fizz";
		} else if ( i % 5 == 0 ) {
			return "Buzz";
		} else {
			return i.toString();
		}
	}
}
