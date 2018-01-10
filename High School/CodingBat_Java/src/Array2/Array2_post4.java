package Array2;

import java.io.IOException;

public class Array2_post4 {
	
	public static int[] post4(int[] nums) {
		
		int four = 0;
		
		for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] == 4) {
		
				four = i;
		
			}
		
		}
		 
		four++;
		int[] result = new int[nums.length - four]; 
		
		for(int i = four; i < nums.length; i++) {
		
			result[i - four] = nums[i];
		
		}
		 
		return result;
		
	}

	public static void main (String[] args) throws IOException {
		
		int[] nums = {5 , 6, 7, 4};
		
		System.out.println(post4(nums));
		
	}

}
