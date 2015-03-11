package chap1;

public class Exo6 {
	
	public static void swap(int top[], int left[], int right[],  int bottom[], int size) {
		for (int i=0; i< size; i++) {
			int tmp = top[i];
			top[i] = left[i];
			left[i] = bottom[i];
			bottom[i] = right[i];
			right[i] = tmp;
		}
	}

}
