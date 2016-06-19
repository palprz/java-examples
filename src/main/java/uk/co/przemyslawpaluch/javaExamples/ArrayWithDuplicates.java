package uk.co.przemyslawpaluch.javaExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Program: Array with duplicates
 * Find duplicates in array.
 * @author Przemyslaw Paluch
 */
public class ArrayWithDuplicates {

	public static void main(String[] args) {
		Integer[] array = {0,1,2,5,3,4,5,6,7,8,8,9,0};
		System.out.println( findDuplicates( array ) );
	}

	public static List< Integer > findDuplicates( Integer[] array ) {
		List< Integer > duplicates = new ArrayList< Integer >();
		HashMap< Integer, Integer > map = new HashMap< Integer, Integer >();
		for ( int i = 0; i < array.length; i++ ) {
			Integer element = array[ i ];
			
			if ( map.containsKey( element ) ) {
				map.put( element, map.get( element ) + 1 );
			} else {
				map.put( element , 1 );
			}
		}
		
		for ( int i = 0; i < map.size(); i++ ) {
			if ( map.get( i ) > 1 ) {
				duplicates.add( i );
			}
		}

		return duplicates;
	}
}
