package Array2;

import java.io.IOException;

public class Array2_zeroFront {
	
	public static int[] zeroFront(int[] nums) {
		
		int[] result = new int[nums.length];
		int zero = 0;
		int other = 0;
		 
		for (int i = 0; i < nums.length; i++) {
		
			if(nums[i] == 0) {
		
				zero++;
		
			} else {
		
				other = nums[i];
		
			}
		
		}
		 
		for (int i = 0; i < zero; i++) {
		
			result[i] = 0;
		
		}
		 
		for (int i = zero; i < nums.length; i++) {
		
			result[i] = other;
		
		}
		
		return result;

		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 6, 0, 0};
		
		System.out.println(zeroFront(nums));
		
	}

}
