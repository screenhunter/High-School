package Array2;

import java.io.IOException;

public class Array2_pre4 {
	
	public static int[] pre4(int[] nums) {
		
		int pos4 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 4) {
				
				pos4 = i;
				break;
				
			}
			
		}
		
		int[] result = new int[pos4];
		
		for (int i = 0; i < result.length; i++) {
			
			result[i] = nums[i];
			
		}
		
		return result;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5 , 6, 7, 4};
		
		System.out.println(pre4(nums));
		
	}

}
