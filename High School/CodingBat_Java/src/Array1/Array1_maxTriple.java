package Array1;

import java.io.IOException;

public class Array1_maxTriple {
	
	public static int maxTriple(int[] nums) {
		
		if (nums[0] >= nums[nums.length/2] && nums[0] >= nums[nums.length-1]) {
			
			return nums[0];
			
		} else if (nums[nums.length/2] >= nums[0] && nums[nums.length/2] >= nums[nums.length-1]) {
			
			return nums[nums.length/2];
			
		} else {
			
			return nums[nums.length-1];
					
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4, 5, 7, 8, 4};
		
		System.out.println(maxTriple(nums));
		
	}

}
