package Array1;

import java.io.IOException;

public class Array1_start1 {
	
	public static int start1(int[] a, int[] b) {
		
		int count = 0;
		
		if (a.length > 0) {
			
			if (a[0] == 1) {
				
				count++;
				
			}
			
		}
		
		if (b.length > 0) {
			
			if (b[0] == 1) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {1};
		int[] b = {1};
		
		System.out.println(start1(a, b));
		
	}

}
