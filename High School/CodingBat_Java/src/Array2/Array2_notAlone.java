package Array2;

import java.io.IOException;

public class Array2_notAlone {
	
	public static int[] notAlone(int[] nums, int val) {
		
		for(int i = 1; i < nums.length - 1; i++) {
		
			if(nums[i] == val) {
		
				if(nums[i - 1] == val || nums[i + 1] == val) {
		
				} else {
		
					nums[i] = Math.max(nums[i - 1], nums[i + 1]);
		
				}
		
			}
		
		}
		
		return nums;
		
	}

	public static void main (String[] args) throws IOException {
		
		int[] nums = {5 , 6, 7, 4};
		int val = 9;
		
		System.out.println(notAlone(nums, val));
		
	}

}
