package Array1;

import java.io.IOException;

public class Array1_maxEnd3 {
	
	public static int[] maxEnd3(int[] nums) {
		
		if (nums[0] >= nums[2]) {
			
			for (int i = 0; i < 3; i++) {
				
				nums[i] = nums[0];
				
			}
			
		} else {
			
			for (int i = 0; i < 3; i++) {
				
				nums[i] = nums[2];
				
			}
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {7, 8, 9};
		
		System.out.println(maxEnd3(nums)[2]);
		
	}

}
