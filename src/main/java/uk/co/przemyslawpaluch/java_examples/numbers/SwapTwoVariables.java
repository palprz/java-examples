package uk.co.przemyslawpaluch.java_examples.numbers;

/**
 * <h2>Swap two variables without using temporary variable</h2>
 *
 * There are a few ways of doing this (e.g. XOR). This class contains two of them:
 * - with using addition and subtraction
 * - with using multiplication and division
 *
 *
 * @author Przemyslaw Paluch
 */
public class SwapTwoVariables {

	public static void main( String[] args ) {
		swapFirstWay();
		swapSecondWay();
	}

	//With using addition and subtraction
	private static void swapSecondWay() {
		int x1 = 5;
		int y1 = 23;
		System.out.println( "Before ->  x:" + x1 + ", y: " + y1 );
		x1 = x1 + y1;
		y1 = x1 - y1;
		x1 = x1 - y1;
		System.out.println( "After ->  x:" + x1 + ", y: " + y1 );
	}
	
	//With using multiplication and division
	private static void swapFirstWay() {
		int x2 = 8;
		int y2 = 14;
		System.out.println( "Before ->  x:" + x2 + ", y: " + y2 );
		x2 = x2 * y2;
		y2 = x2 / y2;
		x2 = x2 / y2;
		System.out.println( "After ->  x:" + x2 + ", y: " + y2 );
	}
}
