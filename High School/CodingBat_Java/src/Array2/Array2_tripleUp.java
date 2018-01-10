package Array2;

import java.io.IOException;

public class Array2_tripleUp {
	
	public static boolean tripleUp(int[] nums) {
		
		for (int i = 0; i < nums.length - 2; i++) {
			
			if (nums[i] == nums[i+1] - 1 && nums[i+1] == nums[i+2] - 1) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1,2,};
		
		System.out.println(tripleUp(nums));
		
	}

}
