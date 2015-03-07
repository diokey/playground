package chap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exo3Test {

	@Test
	public void isPermutationTest() {
		assertFalse("Should be a permutation",Exo3.isPermutation2("god ", "dog"));
		assertTrue("Should be a permutation",Exo3.isPermutation2("god","dog"));
		assertTrue("Should be a permutation",Exo3.isPermutation2("olivier", "olivier"));
		assertFalse("Should be a permutation",Exo3.isPermutation2("test", "oilveir"));
		
		assertFalse("Should be a permutation",Exo3.isPermutation("god ", "dog"));
		assertTrue("Should be a permutation",Exo3.isPermutation("god", "dog"));
		assertTrue("Should be a permutation",Exo3.isPermutation("olivier", "olivier"));
		assertFalse("Should be a permutation",Exo3.isPermutation("test", "oilveir"));
	}
}
