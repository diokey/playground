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
	 */
	public static boolean hasUniqueCharacters(String word) {
		if (word.length() >256)
			return false;
		char[] verifier = new char[word.length()];
		char[] wordArray = word.toCharArray();
		for(int i=0, wordLength = wordArray.length; i < wordLength; i++) {
			if(isAlreadySeen(wordArray[i], verifier)) {
				return false;
			} else {
				verifier[i] = wordArray[i];
			}
		}
		return true;
	}
	
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
