package Array1;

import java.io.IOException;

public class Array1_fix23 {
	
	public static int[] fix23(int[] nums) {
		
		for (int i = 0; i < nums.length-1; i++) {
			
			if (nums[i] == 2 && nums[i+1] == 3) {
				
				nums[i+1] = 0;
				
			}
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4};
		
		System.out.println(fix23(nums)[1]);
		
	}

}
