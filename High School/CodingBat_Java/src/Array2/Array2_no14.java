package Array2;

import java.io.IOException;

public class Array2_no14 {
	
	public static boolean no14(int[] nums) {
		
		boolean result1 = true;
		boolean result4 = true;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 1) {
				
				result1 = false;
				
			}
			
			if (nums[i] == 4) {
				
				result4 = false;
				
			}
			
		}
		
		if (result1 == true || result4 == true) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 6, 7, 8};
		
		System.out.println(no14(nums));
		
	}

}
