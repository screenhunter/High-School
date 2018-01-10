package Warmup2;

import java.io.IOException;

public class Warmup2_noTriples {
	
	public static boolean noTriples(int[] nums) {
		
		for (int i = 0; i < (nums.length-2); i++) {
		
			int first = nums[i];
		
			if (nums[i+1] == first && nums[i+2] == first) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 2, 3, 3, 3};
		
		System.out.println(noTriples(nums)); 

	}

}
