package uk.co.przemyslawpaluch.java_examples.strings;

import java.util.HashMap;

/**
 * <h2>Character counter</h2>
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

	public static HashMap< Character, Integer > countCharacters( String word ) {
		HashMap< Character, Integer > map = new HashMap< Character, Integer >();
		for ( Integer i = 0; i < word.length(); i++ ) {
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
