package uk.co.przemyslawpaluch.java_examples.strings;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

/**
 * @author Przemyslaw Paluch
 */
public class CharacterCounterTest {
	private static final String WORD1 = "";
	private static final HashMap< Character, Integer > MAP = new HashMap< Character, Integer >();
	
	@Test
	public void shouldReturnEmptyHashMap() {
		assertEquals( MAP , CharacterCounter.countCharacters( WORD1 ) );
	}
}
