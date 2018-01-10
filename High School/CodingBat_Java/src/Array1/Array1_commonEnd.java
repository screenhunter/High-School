package Array1;

import java.io.IOException;

public class Array1_commonEnd {
	
	public static boolean commonEnd(int[] a, int[] b) {
		
		if ((a.length > 0 && b.length > 0) && (a[0] == b[0] || a[a.length-1] == b[b.length-1])) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {7, 0, 3};
		int[] b = {};
		
		System.out.println(commonEnd(a, b));
		
	}

}
