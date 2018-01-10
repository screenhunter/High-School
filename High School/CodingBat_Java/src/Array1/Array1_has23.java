package Array1;

import java.io.IOException;

public class Array1_has23 {
	
	public static boolean has23(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 2 || nums[i] == 3) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(has23(nums));
		
	}

}
