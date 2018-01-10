package Array2;

import java.io.IOException;

public class Array2_centeredAverage {
	
	public static int centeredAverage(int[] nums) {
		
		int max  = nums[0];
		int min = nums[0];
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
			
			sum += nums[i];
			
		}
		
		sum -= (max + min);
		
		return sum/(nums.length-2);
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 2, 3, 4, 100};
		
		System.out.println(centeredAverage(nums));
		
	}

}
