package Array2;

import java.io.IOException;

public class Array2_lucky13 {
	
	public static boolean lucky13(int[] nums) {
		
		boolean result = true;
		
		for (int i = 0; i < nums.length; i++) {
				
			if (nums[i] == 1 || nums[i] == 3) {
				
				result = false;
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 1, 2, 2};
		
		System.out.println(lucky13(nums));
		
	}

}
