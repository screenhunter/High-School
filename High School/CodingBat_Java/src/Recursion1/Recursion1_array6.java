package Recursion1;

import java.io.IOException;

public class Recursion1_array6 {

	public static boolean array6(int[] nums, int index) {
		
		if (index + 1 > nums.length) {
			
			return false;
			
		} else if (nums[index] == 6) {
			
			return true;
			
		} else {
			
			return array6(nums, index + 1);
			
		}
		  
	}

	public static void main(String[] args) throws IOException {

		int[] nums = {1, 4, 6};
		int index = 0;
		
		System.out.println(array6(nums, index));

	}
	
}
