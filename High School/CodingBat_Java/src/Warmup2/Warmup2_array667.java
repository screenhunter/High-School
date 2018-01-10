package Warmup2;

import java.io.IOException;

public class Warmup2_array667 {
	
	public static int array667(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < (nums.length-1); i++) {
			
			if (nums[i] == 6) {
				
				if (nums[i+1] == 6 || nums[i+1] == 7) {
					
					count++;
					
				}
				
			}
			
		}
		
		return count;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 2, 3};
		
		System.out.println(array667(nums)); 

	}
	
}
