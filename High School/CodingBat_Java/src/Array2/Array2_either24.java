package Array2;

import java.io.IOException;

public class Array2_either24 {
	
	public static boolean either24(int[] nums) {
		
		boolean double2 = false;
		boolean double4 = false;
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] == 2 && nums[i + 1] == 2) {
				
				double2 = true;
				
			}
			
			if (nums[i] == 4 && nums[i + 1] == 4) {
				
				double4 = true;
				
			}
			
		}
		
		if ((double2 == true && double4 == true) || (double2 == false && double4 == false)) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 1, 4, 4};
		
		System.out.println(either24(nums));
		
	}

}
