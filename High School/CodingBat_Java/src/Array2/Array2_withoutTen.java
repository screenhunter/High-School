package Array2;

import java.io.IOException;

public class Array2_withoutTen {
	
	public static int[] withoutTen(int[] nums) {
		
		int[] result = new int[nums.length];
		int j = 0;
		
		for (int i = 0; i < nums.length; i++) {
		
			if (nums[i] == 10) {
		
			} else {
		
				result[j] = nums[i];
				j++;
		
			}
		
		}
		 
		for (int i = j; i < nums.length; i++) {
		
			result[i] = 0;
		
		}
		
		return result;
		
	}

	public static void main (String[] args) throws IOException {
		
		int[] nums = {};
		
		System.out.println(withoutTen(nums));
		
	}

}
