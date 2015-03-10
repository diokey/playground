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
	
	public static void main(String args[]) {
		System.out.println(compress("aabcccccaaa"));
	}
}
