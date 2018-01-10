package Array1;

import java.io.IOException;

public class Array1_unlucky1 {
	
	public static boolean unlucky1(int[] nums) {
		
		if (nums.length >= 2) {
			
			if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)) {
				
				return true;
				
			}
			
			if (nums.length >= 3) {
				
				if (nums[1] == 1 && nums[2] == 3) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4, 5, 7, 8, 4};
		
		System.out.println(unlucky1(nums));
		
	}

}
