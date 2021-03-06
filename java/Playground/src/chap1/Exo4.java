package chap1;

public class Exo4 {
	
	public static void replaceSpace(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		
		for (i=0; i<length; i++) {
			if(str[i]== ' ') {
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		
		for (i=length-1; i>=0; i--) {
			if(str[i]==' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength-=3;
			} else {
				str[newLength-1] = str[i];
				newLength--;
			}
		}
	}
	
	public static void main(String[] args) {
		String s  = "Hello world   ";
		char[] schar = s.toCharArray();
		replaceSpace(schar, 11);
		System.out.println(schar);
	}

}
