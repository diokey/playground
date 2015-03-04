package chap1;

import static org.junit.Assert.*;

import org.junit.Test;
 

public class Exo1Test {

	@Test
	public void hasUniqueCharactersTest() {
		assertTrue("Should have Unique characters", Exo1.hasUniqueCharacters("ABCD"));
		assertFalse("Should have duplicate characters", Exo1.hasUniqueCharacters("ABCDA"));
		assertTrue("Should have Unique characters", Exo1.hasUniqueCharacters("diokey"));
		assertFalse("Should have duplicate characters", Exo1.hasUniqueCharacters("Dusabimana"));
		assertFalse("Should have Unique characters", Exo1.hasUniqueCharacters("olivier"));	
	}
	
	@Test
	public void hasUniqueCharacateres2Test() {
		assertTrue("Should have Unique characters", Exo1.hasUniqueCharacters2("ABCD"));
		assertFalse("Should have duplicate characters", Exo1.hasUniqueCharacters2("ABCDA"));
		assertTrue("Should have Unique characters", Exo1.hasUniqueCharacters2("diokey"));
		assertFalse("Should have duplicate characters", Exo1.hasUniqueCharacters2("Dusabimana"));
		assertFalse("Should have Unique characters", Exo1.hasUniqueCharacters2("olivier"));		
	}
	
}
