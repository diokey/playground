package chap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exo3Test {

	@Test
	public void isPermutationTest() {
		assertTrue("Should be a permutation",Exo3.isPurmutation("olivier", "oilveir"));
		assertTrue("Should be a permutation",Exo3.isPurmutation("olivier", "olivier"));
		assertFalse("Should be a permutation",Exo3.isPurmutation("test", "oilveir"));
	}
}
