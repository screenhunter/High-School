package Array2;

import java.io.IOException;

public class Array2_bigDiff {
	
	public static int bigDiff(int[] nums) {
		
		int min = nums[0];
		int max = nums[0];
		
		if (nums.length > 1) {
			
			for (int i = 0; i < nums.length; i++) {
				
				min = Math.min(min, nums[i]);
				max = Math.max(max, nums[i]);
				
			}
			
			return max - min;
			
		} else {
			
			return 0;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4};
		
		System.out.println(bigDiff(nums));
		
	}

}
