package Array2;

import java.io.IOException;

public class Array2_sameEnds {
	
	public static boolean sameEnds(int[] nums, int len) {
		
		for(int i = 0; i < len; i++) {
		
			if(nums[i] == nums[nums.length - (len) + i]) {
		
			} else {
		
				return false;
		
			}
		
		}
		
		return true;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {8, 2, 3, 9, 5, 8, 2};
		int len = 2;
		
		System.out.println(sameEnds(nums, len));
		
	}

}
