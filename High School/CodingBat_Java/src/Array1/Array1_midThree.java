package Array1;

import java.io.IOException;

public class Array1_midThree {
	
	public static int[] midThree(int[] nums) {
		
		int[] newNums = {nums[(nums.length/2)-1], nums[(nums.length/2)], nums[(nums.length/2)+1]};
		
		return newNums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2, 3, 4};
		
		System.out.println(midThree(nums)[1]);
		
	}

}
