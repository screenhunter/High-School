package Warmup2;

import java.io.IOException;

public class Warmup2_arrayCount9 {
	
	public static int arrayCount9(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 9) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {0, 0, 0};
		
		System.out.println(arrayCount9(nums)); 

	}

}
