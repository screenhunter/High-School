package Array3;

import java.io.IOException;

public class Array3_canBalance {
	
	public static boolean canBalance(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			
		}
		
		if (sum % 2 == 1) {
			
			return false;
			
		}
			
		int half = sum/2;
		
		int sum2 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			sum2 += nums[i];
			
			if (sum2 == half) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 4, 5, 4};
		
		System.out.println(canBalance(nums));
		
	}

}
