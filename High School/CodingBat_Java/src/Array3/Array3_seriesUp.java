package Array3;

import java.io.IOException;

public class Array3_seriesUp {
	
	public static int[] seriesUp(int n) {
		  
		int[] nums = new int[n*(n+1)/2];
		int j = 0;
		  
		for(int i = 0; i <= n; i++) {
		     
			for(int k = 1; k < (i + 1); k++) {
		        
				nums[j] = k;
		        j++;
		     
			}
		  
		}
		  
		return nums;
		
	}

	public static void main (String[] args) throws IOException {
		
		int n = 3;
		
		System.out.println(seriesUp(n));
		
	}

}
