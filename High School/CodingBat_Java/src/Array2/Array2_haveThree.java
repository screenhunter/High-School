package Array2;

import java.io.IOException;

public class Array2_haveThree {
	
	public static boolean haveThree(int[] nums) {
		
		int count3 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 3) {
				
				count3++;
				
			}
			
		}
		
		if (count3 == 3) {
			
			for (int i = 0; i < nums.length - 1; i++) {
				
				if (nums[i] == 3 && nums[i+1] == 3) {
					
					return false;
					
				}
				
			}
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {8, 2, 3, 9, 5, 8};
		
		System.out.println(haveThree(nums));
		
	}

}
