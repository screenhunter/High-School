package Array2;

import java.io.IOException;

public class Array2_evenOdd {
	
	public static int[] evenOdd(int[] nums) {
		
		int[] result = new int[nums.length];
		int index = 0;
		 
		for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] % 2 == 0) {
		
				result[index] = nums[i];
				index++;
		
			}
		
		}
		 
		for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] % 2 != 0) {
		
				result[index] = nums[i];
				index++;
		
			}
		
		}
		 
		return result;
		
	}

	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 4, 9, 16};
		
		System.out.println(evenOdd(nums));
		
	}

}
