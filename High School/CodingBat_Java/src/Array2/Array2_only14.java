package Array2;

import java.io.IOException;

public class Array2_only14 {
	
	public static boolean only14(int[] nums) {
		
		boolean result = true;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] != 1 && nums[i] != 4) {
				
				result = false;
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 4};
		
		System.out.println(only14(nums));
		
	}

}
