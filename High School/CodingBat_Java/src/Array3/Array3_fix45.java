package Array3;

import java.io.IOException;

public class Array3_fix45 {
	
	public static int[] fix45(int[] nums) {
		
		String lastpos5 = "";
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 4) {
				
				int temp = nums[i+1];
				
				if (temp == 5) {
					
					lastpos5 += (i+1) + ",";
					continue;
					
				}
				
				for (int j = 0; j < nums.length; j++) {
					
					if (lastpos5.indexOf(j + ",") >= 0) {
						
						continue;
						
					}
					
					if (nums[j] == 5) {
						
						nums[i+1] = 5;
						lastpos5 += j + "," + (i+1) +",";
						nums[j] = temp;
						break;
						
					}
					
				}
				
			}
			
		}
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 4, 5, 4, 1};
		
		System.out.println(fix45(nums));
		
	}

}
