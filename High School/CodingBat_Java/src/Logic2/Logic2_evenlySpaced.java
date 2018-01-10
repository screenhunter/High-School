package Logic2;

import java.io.IOException;

public class Logic2_evenlySpaced {
	
	public static boolean evenlySpaced(int a, int b, int c) {
		
		int min = 0;
		int mid = 0;
		 
		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		 
		if(max2 == a) {
		
			min = Math.min(b, c);
		
			if(min == b) {
		
				mid = c;
		
			} else {
		
				mid = b;
		
			}
		
		} else if(max2 == b) {
		
			min = Math.min(a, c);
			
			if(min == a) {
		
				mid = c;
		
			} else {
		
				mid = a;
		
			}
		
		} else if(max2 == c) {
		
			min = Math.min(a, b);
			
			if(min == a) {
		
				mid = b;
		
			} else {
		
				mid = a;
		
			}
		
		}
		 
		if((max2 - mid) == (mid - min)) {
		
			return true;
		
		} else {
		
			return false;
		
		}
		
	}

	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 23;
		int c = 23;
		
		System.out.println(evenlySpaced(a, b, c));
		
	}

}
