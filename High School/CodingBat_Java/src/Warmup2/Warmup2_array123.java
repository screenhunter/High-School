package Warmup2;

import java.io.IOException;

public class Warmup2_array123 {
	
	public static boolean array123(int[] nums) {
		
		boolean answer = false;
		
		String numbers = "";
		
		for (int i = 0; i < nums.length; i++) {
			
			numbers += nums[i];
			
		}
		
		if (numbers.contains("1")) {
			
			if (numbers.contains("2")) {
				
				if (numbers.contains("3")) {
					
					answer = true;
					
				}
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {1, 2, 3};
		
		System.out.println(array123(nums)); 

	}

}
