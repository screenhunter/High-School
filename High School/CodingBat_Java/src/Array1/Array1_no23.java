package Array1;

import java.io.IOException;

public class Array1_no23 {
	
	public static boolean no23(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 2 || nums[i] == 3) {
				
				return false;
				
			}
			
		}
		
		return true;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {7, 4, 5, 6};
		
		System.out.println(no23(nums));
		
	}

}
