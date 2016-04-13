package uk.co.przemyslawpaluch.java_examples.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Fibonacci numbers without using recursion</h2>
 * 
 * Fibonacci list:			1, 1, 2, 3, 5, 8, 13,21,34,55,89,144...
 * and number in this list: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12... 
 * 
 * Class contains methods which get:
 * - one of the element from Fibonacci list
 * - get numbers of first elements of Fibonacci list
 * - get numbers from Fibonacci list below maximum value
 * 
 * @author Przemyslaw Paluch
 */
public class FibonacciWithoutRecursion {

	public static void main( String[] args ) {
		System.out.println( "Index: 6, Fibonacci number: " + getFibonacciNumberElement( 6 ) );
		System.out.println( "List of 10 first elements: " + getFibonacciNumbersElements( 10 ) );
		System.out.println( "List of element below 150: " + getFibonacciNumbersTill( 150 ) );
	}

	/**
	 * Get one element from Fibonacci list.
	 * @param whichElement the element from Fibonacci list
	 * @return element from Fibonacci list
	 */
	public static Integer getFibonacciNumberElement( int whichElement ) {
		//Simple check
		if ( whichElement < 1 ) {
			throw new ArithmeticException( "Please input element bigger than 0!" );
		}
		
		//First two elements in this list must be 1
		if ( whichElement == 1 || whichElement == 2 ) {
			return 1;
		}
		
		Integer fibonacciNumber = 1;
		Integer fibonacciPreviousNumber = 1;
		//Start from 3, because two first cases we have above
		for ( int i = 3; i <= whichElement; i++ ) {
			/* Example for getting 7th element:
			 * 13 = 8 + 5;
			 * 8 = 13 - 5;
			 */
			fibonacciNumber = fibonacciNumber + fibonacciPreviousNumber;
			fibonacciPreviousNumber = fibonacciNumber - fibonacciPreviousNumber;
		}
		
		return fibonacciNumber;
	}

	/**
	 * Get number of elements from Fibonacci list.
	 * @param maxFibonacciElement the maximum Fibonacci elements
	 * @return list of Fibonacci elements
	 */
	public static List< Integer > getFibonacciNumbersElements( int maxFibonacciElement ) {
		//Simple check
		if ( maxFibonacciElement < 1 ) {
			throw new ArithmeticException( "Please input element bigger than 0!" );
		}
		
		List< Integer > fibonacciList = new ArrayList< Integer >();
		//First two elements in this list must be 1
		for ( int i = 1; i <= maxFibonacciElement; i++ ) {
			if ( i == 1 || i == 2 ) {
				fibonacciList.add( 1 );
				continue;
			}
			
			Integer fibonacciNumber = 1;
			Integer fibonacciPreviousNumber = 1;
			//Start from 3, because two first cases we have above
			for ( int j = 3; j <= i; j++ ) {
				/* Example for getting 7th element:
				 * 13 = 8 + 5;
				 * 8 = 13 - 5;
				 */
				fibonacciNumber = fibonacciNumber + fibonacciPreviousNumber;
				fibonacciPreviousNumber = fibonacciNumber - fibonacciPreviousNumber;
			}
			fibonacciList.add( fibonacciNumber );
		}
		
		return fibonacciList;
	}

	/**
	 * Get Fibonacci numbers below input value.
	 * @param tillNumber Fibonacci numbrs must be lower then this number
	 * @return list of Fibonacci elements
	 */
	public static List< Integer > getFibonacciNumbersTill( int tillNumber ) {
		//Simple check
		if ( tillNumber < 1 ) {
			throw new ArithmeticException( "Please input element bigger than 0!" );
		}
		
		List< Integer > fibonacciList = new ArrayList< Integer >();
		Integer fibonacciNumber = 1;
		Integer fibonacciPreviousNumber = 1;		
		//First two elements in this list must be 1
		for ( int i = 1; fibonacciNumber < tillNumber ; i++ ) {
			if ( i == 1 || i == 2 ) {
				fibonacciList.add( fibonacciNumber );
				continue;
			}
			
			fibonacciNumber = 1;
			fibonacciPreviousNumber = 1;
			//Start from 3, because two first cases we have above
			for ( int j = 3; j <= i; j++ ) {
				/* Example for getting 7th element:
				 * 13 = 8 + 5;
				 * 8 = 13 - 5;
				 */
				fibonacciNumber = fibonacciNumber + fibonacciPreviousNumber;
				fibonacciPreviousNumber = fibonacciNumber - fibonacciPreviousNumber;
			}
			/* If Fibonacci number is bigger then maximum value -> do not add to return list.
			 * Case for last valid iteration. 
			 */
			if ( fibonacciNumber < tillNumber ) {
				fibonacciList.add( fibonacciNumber );
			}
		}
		
		return fibonacciList;	
	}
}
