package Array2;

import java.io.IOException;

public class Array2_countEvens {
	
	public static int countEvens(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] % 2 == 0) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(countEvens(nums));
		
	}

}
