package Array1;

import java.io.IOException;

public class Array1_firstLast6 {
	
	public static boolean firstLast6(int[] nums) {
		
		if (nums.length > 0) {
			
			if (nums[0] == 6 || nums[nums.length-1] == 6) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
	
		System.out.println(firstLast6(nums)); 

	}

}
