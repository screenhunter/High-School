package Array1;

import java.io.IOException;

public class Array1_sum2 {
	
	public static int sum2(int[] nums) {
		
		if (nums.length >= 2) {
			
			return nums[0] + nums[1];
			
		} else if (nums.length == 1) {
			
			return nums[0];
			
		}
		
		return 0;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(sum2(nums));
		
	}

}
