package Array2;

import java.io.IOException;

public class Array2_zeroMax {
	
	public static int[] zeroMax(int[] nums) {
		
		for(int i = 0; i < nums.length - 1; i++) {
		
			if(nums[i] == 0) {
		
				for (int j = i; j < nums.length; j++) {
					
					if (nums[j] % 2 != 0) {
				
						nums[i] = Math.max(nums[j], nums[i]);
				
					}
					
				}
		
			}
		
		}
		 
		return nums;
		
	}


	public static void main (String[] args) throws IOException {
		
		int[] nums = {0, 1, 0, 2};
		
		System.out.println(zeroMax(nums));
		
	}

}
