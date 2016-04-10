package uk.co.przemyslawpaluch.java_examples.strings;

import java.util.HashMap;

/**
 * <h2>Program: Character counter</h2>
 * 
 * Application counts characters (with using HashMap) in word and print them.
 * 
 * @author Przemyslaw Paluch
 */
public class CharacterCounter {
	private static final String WORD1 = "abcabc";
	private static final String WORD2 = "gfeedcba";
	private static final String WORD3 = "";
	
	public static void main( String[] args ) {
		System.out.println( WORD1 + ": " + countCharacters( WORD1 ) );
		System.out.println( WORD2 + ": " +  countCharacters( WORD2 ) );
		System.out.println( WORD3 + ": " +  countCharacters( WORD3 ) );
	}

	/**
	 * Populate HashMap ("key/value" like "letter/number of letter") for word and return it.
	 * @param word the word for check
	 * @return map after populate
	 */
	public static HashMap< Character, Integer > countCharacters( String word ) {
		HashMap< Character, Integer > map = new HashMap< Character, Integer >();
		//Letter one by one
		for ( Integer i = 0; i < word.length(); i++ ) {
			/* HashMap is populate with rules:
			 * - IF there is already number(value) for this letter(key) THEN increment number for letter
			 * - ELSE there is no number(value) for this letter(key), means is first time when letter is in word, 
			 * THEN put that letter with number 1
			 */
			if ( map.containsKey( word.charAt( i ) ) ) {
				map.put(
						word.charAt( i ),
						map.get( word.charAt( i ) ) + 1 );
			} else {
				map.put(
						word.charAt( i ), 
						1 );
			}
		}
		return map;
	}
}
