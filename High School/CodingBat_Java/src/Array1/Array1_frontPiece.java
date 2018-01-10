package Array1;

import java.io.IOException;

public class Array1_frontPiece {
	
	public static int[] frontPiece(int[] nums) {
		
		if (nums.length > 2) {
			
			int[] newNums = {nums[0], nums[1]};
			
			return newNums;
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4, 5, 7, 8, 4};
		
		System.out.println(frontPiece(nums));
		
	}

}
