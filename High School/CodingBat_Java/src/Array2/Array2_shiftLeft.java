package Array2;

import java.io.IOException;

public class Array2_shiftLeft {
	
	public static int[] shiftLeft(int[] nums) {
		
		for(int i = 0; i < nums.length - 1; i++) {
		
			int temp = nums[i];
		
			nums[i] = nums[i + 1];
		
			nums[i + 1] = temp;
		
		}
		
		return nums;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1,2,3};
		
		System.out.println(shiftLeft(nums));
		
	}

}
