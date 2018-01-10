package Recursion1;

import java.io.IOException;

public class Recursion1_array11 {
	
	public static int array11(int[] nums, int index) {
		
		if (index + 1 > nums.length) {
			
			return 0;
			
		} else if (nums[index] == 11) {
			
			return 1 + array11(nums, index + 1);
			
		} else {
			
			return 0 + array11(nums, index + 1);
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		int[] nums = {11, 4, 6, 11};
		int index = 0;
		
		System.out.println(array11(nums, index));

	}

}
