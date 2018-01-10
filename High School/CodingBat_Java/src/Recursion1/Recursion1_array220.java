package Recursion1;

import java.io.IOException;

public class Recursion1_array220 {
	
	public static boolean array220(int[] nums, int index) {
		
		if (index + 2 > nums.length) {
			
			return false;
			
		} else if (nums[index] * 10 == nums[index + 1]) {
			
			return true;
			
		} else {
			
			return array220(nums, index + 1);
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		int[] nums = {11, 4, 40, 6, 11};
		int index = 0;
		
		System.out.println(array220(nums, index));

	}

}
