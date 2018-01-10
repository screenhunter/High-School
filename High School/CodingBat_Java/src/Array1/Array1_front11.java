package Array1;

import java.io.IOException;

public class Array1_front11 {
	
	public static int[] front11(int[] a, int[] b) {
		
		if (a.length > 0 && b.length > 0) {
			
			int[] nums = {a[0], b[0]};
			
			return nums;
			
		} else if (a.length > 0) {
			
			int[] nums = {a[0]};
			
			return nums;
			
		} else if (b.length > 0) {
			
			int[] nums = {b[0]};
			
			return nums;
			
		} else {
			
			int[] nums = {};
			
			return nums;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {9, 8, 7};
		int[] b = {7, 8, 9};
		
		System.out.println(front11(a, b)[1]);
		
	}

}
