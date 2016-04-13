package uk.co.przemyslawpaluch.java_examples.numbers;

/**
 * <h2>Fibonacci with using recursion</h2>
 * 
 * Fibonacci list:			1, 1, 2, 3, 5, 8, 13,21,34,55,89,144...
 * and number in this list: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12... 
 * 
 * Class contains method which gets one of the element from Fibonacci list.
 * 
 * @author Przemyslaw Paluch
 */
public class FibonacciWithRecursion {

	public static void main(String[] args) {
		System.out.println( getFibonacciNumberElement( 10 ) );
	}

	public static Integer getFibonacciNumberElement( int whichElement ) {
		//Simple check
		if ( whichElement < 1 ) {
			throw new ArithmeticException( "Fibonacci element must be bigger than 0!" );
		}
		
		//First and second element are 1
		if ( whichElement == 1 || whichElement == 2 ) {
			return 1;
		}
		
		/* To get e.g. 6th element you need add 5th and 4th element.
		 * 8 = 5 + 3
		 */
		return getFibonacciNumberElement( whichElement - 1 ) + getFibonacciNumberElement( whichElement - 2 );
	}
}
