package Array1;

import java.io.IOException;

public class Array1_sum3 {
	
	public static int sum3(int[] nums) {
		
		return nums[0] + nums[1] + nums[2];
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {9, 8, 7};
		
		System.out.println(sum3(nums));
		
	}

}
