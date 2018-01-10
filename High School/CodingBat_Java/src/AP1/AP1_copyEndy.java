package AP1;

import java.io.IOException;

public class AP1_copyEndy {
	
	public static int[] copyEndy(int[] nums, int count) {
		
		int[] result = new int[count];
		int pos = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (i - pos == result.length) {
				
				break;
				
			}
			
			if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
				
				result[i - pos] = nums[i];
				
			} else {
				
				pos++;
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main(String[] args) throws IOException {

		int[] nums = {34, 56, 9, 10};
		int count = 2;
		
		System.out.println(copyEndy(nums, count));

	}

}
