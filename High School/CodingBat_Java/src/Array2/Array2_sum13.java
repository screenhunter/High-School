package Array2;

import java.io.IOException;

public class Array2_sum13 {
	
	public static int sum13(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 13) {
				
				i += 1;
				
			} else {
				
				sum += nums[i];
				
			}
			
		}
		
		return sum;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(sum13(nums));
		
	}

}
