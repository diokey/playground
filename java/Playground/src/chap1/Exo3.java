package chap1;

public class Exo3 {
	
	public static boolean isPurmutation(String a, String b) {
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

}
