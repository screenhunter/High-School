package Array2;

import java.io.IOException;

public class Array2_twoTwo {
		
	public static boolean twoTwo(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
		
			if (nums[i] == 2) {
		
				if (i != 0 && nums[i - 1] == 2) {
		
				} else if (i + 1 < nums.length && nums[i + 1] == 2) {
		
				} else {
		
					return false;
		
				}
		
			}
		
		}
		 
		return true;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {8, 2, 3, 9, 5, 8};
		
		System.out.println(twoTwo(nums));
		
	}

}
