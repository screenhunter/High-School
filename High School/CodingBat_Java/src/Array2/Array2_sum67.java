package Array2;

import java.io.IOException;

public class Array2_sum67 {
	
	public static int sum67(int[] nums) {
		
		boolean six = false;
		int result = 0;
		 
		for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] == 6) {
		
				six = true;
		
			} else if(nums[i] == 7 && six) {
		
				six = false;
		
			} else if(!six) {
		
				result += nums[i];
		
			}
		
		}
		
		return result;
		
	}

	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(sum67(nums));
		
	}

}
