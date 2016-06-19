package uk.co.przemyslawpaluch.javaExamples;

/**
 * Program: FizzBuzz.
 * Application prints all the numbers from 1 to 100:<br/>
 * - for multiples of 3, instead of the number, print "Fizz",<br/> 
 * - for multiples of 5, instead of the number, print "Buzz",<br/>
 * - for numbers which are multiples of both 3 and 5, instead of the number, print "FizzBuzz".
 * @author Przemyslaw Paluch
 */
public class FizzBuzz {
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";
	private final static String FIZZ_BUZZ = "FizzBuzz";
	
	public static void main( String[] args ) {
		for ( Integer i = 1; i <=100; i++ ) {
			System.out.println( fizzBuzz( i ) );
		}		
	}

	public static String fizzBuzz( Integer i ) {
		/* Check for 4 cases with that order:
		 * - for 15 (3 * 5) -> this must be for the first place
		 * - for 3 -> more numbers are multiples of 3 then 5, so application can check correct statement quicker
		 * - for 5 -> third option with number and the last one to check 
		 * - for the rest -> if there wasn't anything before that, return String of this number
		 */
		if ( i % ( 3 * 5 ) == 0 ) {
			return FIZZ_BUZZ;
		} else if ( i % 3 == 0 ) {
			return FIZZ;
		} else if ( i % 5 == 0 ) {
			return BUZZ;
		} else {
			return i.toString();
		}
	}
}
