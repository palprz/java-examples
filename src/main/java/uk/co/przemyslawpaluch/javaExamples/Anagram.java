package uk.co.przemyslawpaluch.javaExamples;

import java.util.HashMap;

/**
 * Program: Anagram.
 * Application checks (with using HashMap) if two words are anagrams.
 * @author Przemyslaw Paluch
 */
public class Anagram {
	private final static String WORD1 = "aabbcc";
	private final static String WORD2 = "ccaabb";
	private final static String WORD3 = "ccaadd";
	
	public static void main( String[] args ) {
		checkWords( WORD1, WORD2 ); //TRUE
		checkWords( WORD1, WORD3 ); //FALSE
	}

	private static void checkWords( String word1, String word2 ) {
		if ( checkAnagram( word1, word2 ) ) {
			System.out.println( "The word '" + word1 + "' and word '" + word2 + " are anagrams.");
		} else {
			System.out.println( "The word '" + word1 + "' and word '" + word2 + " are NOT anagrams.");
		}
	}

	/**
	 * Populate two HashMaps ("key/value" like "letter/number of letter" in word) for get keys with values for all 
	 * letters of words and return boolean value by compare them.
	 * @param word1 the first word to check
	 * @param word2 the second word to check
	 * @return boolean value
	 */
	public static boolean checkAnagram( String word1, String word2 ) {
		if ( word1.length() != word2.length() ) {
			return false;
		}
		
		HashMap< Character, Integer > map1 = new HashMap< Character, Integer >();
		HashMap< Character, Integer > map2 = new HashMap< Character, Integer >();
		
		//Letter one by one
		for ( Integer i = 0; i < word1.length(); i++ ) {
			/* Populate first HashMap with rules:
			 * - IF there is already number(value) for this letter(key) THEN increment number for letter
			 * - ELSE there is no number(value) for this letter(key), means is first time when letter is in word, 
			 * THEN put that letter with number 1
			 */
			if ( map1.containsKey( word1.charAt( i ) ) ) {
				map1.put( 
						word1.charAt( i ), 
						map1.get( word1.charAt( i ) ) + 1 );
			} else {
				map1.put( 
						word1.charAt( i ), 
						1 );
			}			
			
			//Populate second HashMap with the same rules like for first one.
			if ( map2.containsKey( word2.charAt( i ) ) ) {
				map2.put(
						word2.charAt( i ), 
						map2.get( word2.charAt( i ) ) + 1 );
			} else {
				map2.put(
						word2.charAt( i ),
						1 );
			}
		}
		
		return map1.equals( map2 );
	}
}
