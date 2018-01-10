package Array2;

import java.io.IOException;

public class Array2_tenRun {
	
	public static int[] tenRun(int[] nums) {
		
		int current = -1;
		int[] result = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] % 10 == 0) {
		
				current = nums[i];
		
				result[i] = current;
		
			} else if(current == -1) {
		
				result[i] = nums[i];
		
			} else {
		
				result[i] = current;
		
			}
		
		}
		
		return result;
		
	}

	public static void main (String[] args) throws IOException {
		
		int[] nums = {1,2,3};
		
		System.out.println(tenRun(nums));
		
	}
	
}
