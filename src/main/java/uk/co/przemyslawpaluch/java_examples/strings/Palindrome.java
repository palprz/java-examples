package uk.co.przemyslawpaluch.java_examples.strings;

/**
 * <h2>Palindrome</h2>
 * Check 
 * 
 * @author Przemyslaw Paluch
 */
public class Palindrome {
	private final static String WORD1 = "aba"; //TRUE
	private final static String WORD2 = "abba"; //TRUE
	private final static String WORD3 = "Abba"; //FALSE
	private final static String WORD4 = "ab"; //FALSE
	private final static String WORD5 = "a"; //TRUE
	
	public static void main( String[] args ) {		
		checkWord( WORD1 );
		checkWord( WORD2 );
		checkWord( WORD3 );
		checkWord( WORD4 );
		checkWord( WORD5 );
	}

	private static void checkWord( String word ) {
		if ( checkPalindrome( word ) ) {
			System.out.println( "The word '" + word + "' is palindrome");
		} else {
			System.out.println( "The word '" + word + "' is NOT palindrome" );
		}
	}

	public static boolean checkPalindrome( String word ) {
		for ( Integer i = 0; i < word.length(); i++ ) {
			char frontChar = word.charAt( i );
			char backChar = word.charAt( word.length() - ( i + 1 ) );
			if ( !( frontChar == backChar ) ) {
				return false;
			}
		}
		
		return true;
	}
}
