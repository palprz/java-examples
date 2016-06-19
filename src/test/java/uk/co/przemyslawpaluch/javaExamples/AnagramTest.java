package uk.co.przemyslawpaluch.javaExamples;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.przemyslawpaluch.javaExamples.Anagram;

/**
 * @author Przemyslaw Paluch
 */
public class AnagramTest {
	private static final String WORD1 = "aabbcc";
	private static final String WORD2 = "ccaabb";
	private static final String WORD3 = "ccffaa";
	private static final String WORD4 = "aabbc";
	private static final String WORD5 = "aabbcca";
	private static final String WORD6 = "abcabc";
	
	@Test
	public void shouldEqualTrue() {
		assertTrue( Anagram.checkAnagram( WORD1 , WORD1 ) );
		assertTrue( Anagram.checkAnagram( WORD1 , WORD2 ) );
		assertTrue( Anagram.checkAnagram( WORD1 , WORD6 ) );
		assertTrue( Anagram.checkAnagram( WORD2 , WORD6 ) );
	}
	
	@Test
	public void shouldEqualFalse() {
		assertFalse( Anagram.checkAnagram( WORD1, WORD3 ) );
		assertFalse( Anagram.checkAnagram( WORD1, WORD4 ) );
		assertFalse( Anagram.checkAnagram( WORD1, WORD5 ) );
		assertFalse( Anagram.checkAnagram( WORD3, WORD5 ) );
	}
}
