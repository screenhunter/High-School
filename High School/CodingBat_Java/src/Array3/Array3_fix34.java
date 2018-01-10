package Array3;

import java.io.IOException;

public class Array3_fix34 {
	
	public static int[] fix34(int[] nums) {
		
		int lastpos4 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 3) {
				
				int temp = nums[i+1];
				
				for (int j = lastpos4 + 1; j < nums.length; j++) {
					
					if (nums[j] == 4) {
						
						nums[i+1] = 4;
						lastpos4 = i + 1;
						nums[j] = temp;
						break;
						
					}
					
				}
				
			}
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 3, 1, 4, 4, 3, 1};
		
		System.out.println(fix34(nums));
		
	}

}
