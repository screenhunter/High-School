package Array1;

import java.io.IOException;

public class Array1_reverse3 {
	
	public static int[] reverse3(int[] nums) {
		
		int a = nums[0];
		
		nums[0] = nums[2];
		nums[2] = a;
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {9, 8, 7};
		
		System.out.println(reverse3(nums)[2]);
		
	}

}
