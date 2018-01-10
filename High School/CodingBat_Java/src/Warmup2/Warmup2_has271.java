package Warmup2;

import java.io.IOException;

public class Warmup2_has271 {
	
	public static boolean has271(int[] nums) {
		
		for (int i = 0; i < (nums.length-2); i++) {
		
			int val = nums[i];
		
			if (nums[i+1] == (val + 5) && Math.abs(nums[i+2] - val + 1) <= 2) {
				
				return true;
				
			}
			
		}

		return false;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {3, 5, 2, 8, 7, 1};
		
		System.out.println(has271(nums)); 

	}

}
