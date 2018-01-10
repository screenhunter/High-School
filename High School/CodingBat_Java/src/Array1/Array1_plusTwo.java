package Array1;

import java.io.IOException;

public class Array1_plusTwo {
	
	public static int[] plusTwo(int[] a, int[] b) {
		
		int[] nums = {a[0], a[1], b[0], b[1]};
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {2, 3};
		int[] b = {4, 5};
		
		System.out.println(plusTwo(a, b));
		
	}

}
