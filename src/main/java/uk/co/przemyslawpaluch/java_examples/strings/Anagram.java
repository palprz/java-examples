package uk.co.przemyslawpaluch.java_examples.strings;

import java.util.HashMap;

/**
 * <h2>Anagram</h2>
 * Check if two words are anagrams.
 * 
 * @author Zhukov
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

	public static boolean checkAnagram( String word1, String word2 ) {
		if ( word1.length() != word2.length() ) {
			return false;
		}
		
		HashMap< Character, Integer > map1 = new HashMap< Character, Integer >();
		HashMap< Character, Integer > map2 = new HashMap< Character, Integer >();
		
		for ( Integer i = 0; i < word1.length(); i++ ) {
			//populate first hash map
			if ( !map1.containsKey( word1.charAt( i ) ) ) {
				map1.put( 
						word1.charAt( i ), 
						1 );
			} else {
				map1.put( 
						word1.charAt( i ), 
						map1.get( word1.charAt( i ) ) + 1 );
			}			
			
			//populate second hash map
			if ( !map2.containsKey( word2.charAt( i ) ) ) {
				map2.put(
						word2.charAt( i ),
						1 );
			} else {
				map2.put(
						word2.charAt( i ), 
						map2.get( word2.charAt( i ) ) + 1 );
			}
		}
		
		return map1.equals( map2 );
	}
}
