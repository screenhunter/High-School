package Array1;

import java.io.IOException;

public class Array1_make2 {
	
	public static int[] make2(int[] a, int[] b) {
		
		int[] nums = new int[2];
		
		for (int i = 0; i < a.length && i < 2; i++) {
			
			nums[i] = a[i];
			
		}
		
		if (a.length == 1) {
			
			nums[0] = a[0];
			nums[1] = b[0];
			
		}
		
		if (a.length == 0) {
			
			nums[0] = b[0];
			nums[1] = b[1];
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {1, 2, 3};
		int[] b = {8, 9};
		
		System.out.println(make2(a, b)[1]);
		
	}

}
