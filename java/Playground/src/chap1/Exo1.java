package chap1;

import static org.junit.Assert.*;

public class Exo1 {

	/*
	 * Implement an algorithm to determine
	 * if a string has all unique characters.
	 */
	
	/*
	 * First algorithm.
	 * Use an extra array to retain every character we've seen so far.
	 * Check if we've seen the character. If so, return true, stop. otherwise
	 * continue till to the end
	 * 
	 *  This algorithm is not very optimal. The time complexity is 0(n2) and the space complexity is 0(1).
	 */
	public static boolean hasUniqueCharacters(String word) {
		if (word.length() >256)
			return false;
		char[] verifier = new char[word.length()];
		for(int i=0, wordLength = word.length(); i < wordLength; i++) {
			if(isAlreadySeen(word.charAt(i), verifier)) {
				return false;
			} else {
				verifier[i] = word.charAt(i);
			}
		}
		return true;
	}
	
	/*
	 * This is an improvement of the algorithm above.
	 * Instead of storing characters and doing a search to check if we've already seen them
	 * In this algorithm we are simply flagging each character that we've seen at it index.
	 * If the character index (code) is true, we know we've seen that character
	 * This algorithm improves the time complexity to O(n) and 0(1) space complexity.
	 */
	public static boolean hasUniqueCharacters2(String word) {
		boolean[] checker = new boolean[256];
		if (word.length() > 256)
			return false;
		for(int i=0, l= word.length(); i<l; i++) {
			if (checker[word.charAt(i)]) {
				return false;
			}
			checker[word.charAt(i)] = true;
		}
		
		return true;
	}
	
	private static boolean isAlreadySeen(char c, char[] word) {
		for (int i=0, l = word.length; i < l; i++) {
			if (word[i] == c)
				return true;
		}
		return false;
	}
}
