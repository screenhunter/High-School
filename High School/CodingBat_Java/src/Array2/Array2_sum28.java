package Array2;

import java.io.IOException;

public class Array2_sum28 {
	
	public static boolean sum28(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
				
			if (nums[i] == 2) {
				
				sum += 2;
				
			}
			
		}
		
		if (sum == 8) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 1, 2, 2};
		
		System.out.println(sum28(nums));
		
	}

}
