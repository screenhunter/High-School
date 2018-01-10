package Array1;

import java.io.IOException;

public class Array1_biggerTwo {
	
	public static int[] biggerTwo(int[] a, int[] b) {
		
		if (a[0] + a[1] >= b[0] + b[1]) {
			
			return a;
			
		} else {
			
			return b;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {2, 3};
		int[] b = {4, 5};
		
		System.out.println(biggerTwo(a, b));
		
	}

}
