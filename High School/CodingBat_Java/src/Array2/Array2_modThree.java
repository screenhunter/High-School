package Array2;

import java.io.IOException;

public class Array2_modThree {
	
	public static boolean modThree(int[] nums) {
		
		if (nums.length >= 3) {
			
			for (int i = 0; i < nums.length - 2; i++) {
				
				if ((nums[i] % 2 == 1 && nums[i+1] % 2 == 1) && nums[i+2] % 2 == 1) {
					
					return true;
					
				}
				
				if ((nums[i] % 2 == 0 && nums[i+1] % 2 == 0) && nums[i+2] % 2 == 0) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {8, 2, 3, 9, 5, 8};
		
		System.out.println(modThree(nums));
		
	}

}
