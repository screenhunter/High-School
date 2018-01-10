package Array2;

import java.io.IOException;

public class Array2_has77 {
	
	public static boolean has77(int[] nums) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (i < nums.length - 2) {
				
				if ((nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7)) {
					
					return true;
					
				}
				
			} else {
				
				if (nums[i] == 7 && nums[i+1] == 7) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {9, 7, 8, 7};
		
		System.out.println(has77(nums));
		
	}

}
