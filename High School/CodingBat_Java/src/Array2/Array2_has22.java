package Array2;

import java.io.IOException;

public class Array2_has22 {
	
	public static boolean has22(int[] nums) {
		
		boolean result = false;
		
		for (int i = 0; i < nums.length - 1; i++) {
				
			if (nums[i] == 2 && nums[i + 1] == 2) {
				
				result = true;
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 1, 2, 2};
		
		System.out.println(has22(nums));
		
	}

}
