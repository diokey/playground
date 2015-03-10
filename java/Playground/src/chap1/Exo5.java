package chap1;

public class Exo5 {

	public static String compress(String word) {
		int l = word.length();
		String compressed = "";
		char prev = word.charAt(0);
		int counter = 1;
		for(int i=1; i<l; i++) {
			
			if(word.charAt(i) == prev) {
				counter++;
			} else {
				compressed += prev + "" + counter;
				prev = word.charAt(i);
				counter = 1;
			}
		}
		return compressed + prev + counter;
	}
	
	/*
	 * The second solution introduces a small optimization using string buffer. 
	 * This allows the algorithm to run in O(n) space and O(n) time
	 */
	public static String compress2(String word) {
		int l = word.length();
		StringBuilder compressed = new StringBuilder();
		char prev = word.charAt(0);
		int counter = 1;
		for(int i=1; i<l; i++) {
			
			if(word.charAt(i) == prev) {
				counter++;
			} else {
				compressed.append(prev).append(counter);
				prev = word.charAt(i);
				counter = 1;
			}
		}
		String res = compressed.append(prev).append(counter).toString();
		return res.length() > word.length() ? 
				word : compressed.append(prev).append(counter).toString();
	}
	
	public static void main(String args[]) {
		System.out.println(compress2("aabcccccaaa"));
		System.out.println(compress2("abcdefge"));
	}
}
