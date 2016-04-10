package uk.co.przemyslawpaluch.java_examples.strings;

/**
 * <h2>Program: Palindrome</h2>
 * 
 * Application checks if two words are palindromes.
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

	/**
	 * @param word the word to check
	 * @return boolean value
	 */
	public static boolean checkPalindrome( String word ) {
		//Letter one by one
		for ( Integer i = 0; i < word.length(); i++ ) {
			//First, second, third...
			char frontChar = word.charAt( i );
			//Last one, second to last, third to last...
			char backChar = word.charAt( word.length() - ( i + 1 ) );
			//Compare these two letters. If somewhere is different between characters -> word is not palindrome.
			if ( !( frontChar == backChar ) ) {
				return false;
			}
		}
		
		return true;
	}
}
