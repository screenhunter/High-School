package Array1;

import java.io.IOException;

public class Array1_swapEnds {
	
	public static int[] swapEnds(int[] nums) {
		
		int a = nums[0];
		
		nums[0] = nums[nums.length-1];
		nums[nums.length-1] = a;
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3};
		
		System.out.println(swapEnds(nums));
		
	}

}
