package Array2;

import java.io.IOException;

public class Array2_has12 {
	
	public static boolean has12(int[] nums) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] == 1) {
				
				for (int j = i; j < nums.length; j++) {
					
					if (nums[j] == 2) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 7, 2};
		
		System.out.println(has12(nums));
		
	}

}
