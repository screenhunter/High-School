package Array1;

import java.io.IOException;

public class Array1_rotateLeft3 {
	
	public static int[] rotateLeft3(int[] nums) {
		
		int a = nums[0];
		
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = a;
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {9, 8, 7};
		
		System.out.println(rotateLeft3(nums)[2]);
		
	}

}
