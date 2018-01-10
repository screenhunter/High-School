package Array1;

import java.io.IOException;

public class Array1_makeMiddle {
	
	public static int[] makeMiddle(int[] nums) {
		
		int[] middle = {nums[(nums.length/2)-1], nums[nums.length/2]};
		
		return middle;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {0, 1, 2, 3};
		
		System.out.println(makeMiddle(nums)[0]);
		
	}

}
