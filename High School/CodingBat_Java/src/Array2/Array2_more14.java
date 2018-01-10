package Array2;

import java.io.IOException;

public class Array2_more14 {
	
	public static boolean more14(int[] nums) {
		
		int count1 = 0;
		int count4 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 1) {
				
				count1++;
				
			}
			
			if (nums[i] == 4) {
				
				count4++;
				
			}
			
		}
		
		if (count1 > count4) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(more14(nums));
		
	}

}
