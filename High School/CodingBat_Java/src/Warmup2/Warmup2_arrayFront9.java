package Warmup2;

import java.io.IOException;

public class Warmup2_arrayFront9 {
	
	public static boolean arrayFront9(int[] nums) {
		
		boolean answer = false;
		
		for (int i = 0; i < 4; i++) {
			
			if (nums.length > i && nums[i] == 9) {
				
				answer = true;
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {9, 1, 2};
		
		System.out.println(arrayFront9(nums)); 

	}

}
