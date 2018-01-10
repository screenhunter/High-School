package Array3;

import java.util.HashSet;
import java.util.Set;

public class Array3_CountClumps {
	
	public static int countClumps(int[] nums) {
		
		int prev = nums[0];
		int counter = 0;
		Set<Integer> list = new HashSet<Integer>();
		
		if (nums.length == 0) {
			
			return 0;
			
		}
		
		for (int i = 1; i < nums.length; i++) {
			
			if (prev == nums[i]) {
				
				list.add(nums[i]);
			
			} else {
				
				if (list.size() > 0) {
					
					counter++;
					list = new HashSet<Integer>();
				
				}
			
			}
			
			prev = nums[i];
		
		}
		
		if (list.size() > 0) {
			
			counter++;
		
		}
		
		return counter;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 1, 1, 1, 1};
		
		System.out.println(countClumps(nums));
	}

}
