package chap1;

import java.util.Arrays;

public class Exo3 {
	
	/*
	 * This is implementation works, but it is a brute force method.
	 * It can certainly work but it is less efficient
	 */
	public static boolean isPermutation(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if ( a == null && b == null)
			return false;
		if ( a.length() != b.length())
			return false;
		for (int i=0,l=a.length(); i<l; i++) {
			if(!characterExists(a.charAt(i), b))
				return false;
		}
		
		return true;
	}
	
	public static boolean characterExists(char c, String s) {
		for (int i=0, l=s.length(); i<l; i++) {
			if (c==s.charAt(i))
				return true;
		}
		return false;
	}
	
	public static String sort(String word) {
		char[] wordArray = word.toCharArray();
		
		Arrays.sort(wordArray);
		
		return new String(wordArray);
	}
	
	public static boolean isPermutation2(String a, String b) {
		if (a.length() != b.length()) 
			return false;
		
		return sort(a).equals(sort(b));
	}

}
