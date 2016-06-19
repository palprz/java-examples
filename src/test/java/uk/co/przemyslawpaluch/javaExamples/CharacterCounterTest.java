package uk.co.przemyslawpaluch.javaExamples;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import uk.co.przemyslawpaluch.javaExamples.CharacterCounter;

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
