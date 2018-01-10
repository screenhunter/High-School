package Array1;

import java.io.IOException;

public class Array1_sameFirstLast {
	
	public static boolean sameFirstLast(int[] nums) {
		
		if (nums.length >= 1 && nums[0] == nums[nums.length-1]) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 2, 3};
	
		System.out.println(sameFirstLast(nums)); 

	}

}
