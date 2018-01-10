package Array2;

import java.io.IOException;

public class Array2_isEverywhere {
	
	public static boolean isEverywhere(int[] nums, int val) {
		
		boolean result = true;
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] != val && nums[i + 1] != val) {
				
				result = false;
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 6, 7};
		int val = 6;
		
		System.out.println(isEverywhere(nums, val));
		
	}

}
