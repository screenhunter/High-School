package Array1;

import java.io.IOException;

public class Array1_double23 {
	
	public static boolean double23(int[] nums) {
		
		int twoCount = 0;
		int threeCount = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 2) {
				
				twoCount++;
				
			} else if (nums[i] == 3) {
				
				threeCount++;
				
			}
			
		}
		
		if (twoCount == 2 || threeCount == 2) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(double23(nums));
		
	}

}
