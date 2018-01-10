package Array3;

import java.io.IOException;

public class Array3_maxSpan {
	
	public static int maxSpan(int[] nums) {
		 
		int max = 0;
		int current = 0;
		  
		for (int i = 0; i < nums.length; i++) {
		     
			current = 0;
		    current = spanFinder(nums[i], nums);
		     
		    if (current > max) {
		    	
		    	max = current;
		    	
		    }
		  
		}  
		  
		return max;
		
	} 
		
	public static int spanFinder(int val, int[] nums) {
		
		int first = 0;
		int second = 0;
		   
		for (int i = 0; i < nums.length; i++) {
		     
			if (nums[i] == val) {
		         
				first = i;
		        
				break;
		      
			}
		   
		}
		    
		for (int j = nums.length - 1; j >= 0; j--) {
		      
			if (nums[j] == val) {
		        
				second = j;
		        break;
		      
			}     
		   
		}
		    
		if (first == second) {
			
			return 1;
			
		} else {
			
			return second + 1 - first;
			
		}
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {5, 6, 0, 0};
		
		System.out.println(maxSpan(nums));
		
	}

}
