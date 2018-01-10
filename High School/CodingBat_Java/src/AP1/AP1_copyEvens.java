package AP1;

import java.io.IOException;

public class AP1_copyEvens {
	
	public static int[] copyEvens(int[] nums, int count) {
		
		int[] result = new int[count];
		  
		for (int i = 0; i < nums.length; i++) {
		   
			if (nums[i] % 2 == 0) {
		    
				for (int k = 0; k < result.length; k++) {
		     
					if (result[k] == 0) {
		      
						result[k] = nums[i];
		      
						break;
		     
					}
		    
				}
		   
			}
		  
		}
		  
		return result;
		
	}
	
	public static void main(String[] args) throws IOException {

		int[] nums = {3, 2, 4, 5, 8};
		int count = 2;
		
		System.out.println(copyEvens(nums, count));

	}

}
