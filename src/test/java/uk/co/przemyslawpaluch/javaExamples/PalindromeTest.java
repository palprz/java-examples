package uk.co.przemyslawpaluch.javaExamples;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.przemyslawpaluch.javaExamples.Palindrome;

/**
 * @author Przemyslaw Paluch
 */
public class PalindromeTest {

	@Test
	public void shouldEqualTrue() {
		assertTrue( Palindrome.checkPalindrome( "abccba" ) );
		assertTrue( Palindrome.checkPalindrome( "abcba" ) );
		assertTrue( Palindrome.checkPalindrome( "aa" ) );
		assertTrue( Palindrome.checkPalindrome( "ccaacc" ) );
	}
	
	@Test
	public void shouldEqualFalse() {
		assertFalse( Palindrome.checkPalindrome( "Aa" ) );
		assertFalse( Palindrome.checkPalindrome( "abc" ) );
		assertFalse( Palindrome.checkPalindrome( "bbaacc" ) );
		assertFalse( Palindrome.checkPalindrome( "cacc" ) );
	}
}
