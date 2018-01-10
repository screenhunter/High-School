package Array2;

import java.io.IOException;

public class Array2_matchUp {
	
	public static int matchUp(int[] nums1, int[] nums2) {
		
		int count = 0;
		
		for (int i = 0; i < nums1.length; i++) {
			
			if (nums1[i] == nums2[i]) {
				
			} else if (nums1[i] <= nums2[i] + 2 && nums1[i] >= nums2[i] - 2) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums1 = {1, 1, 4, 4};
		int[] nums2 = {2, 1, 6, 2};
		
		System.out.println(matchUp(nums1, nums2));
		
	}

}
