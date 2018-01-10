package Recursion1;

import java.io.IOException;

public class Recursion1_count8 {
	
	public static int count8(int n) {
		
		if (n == 0) {
			
			return 0;
			
		} else if (n % 100 == 88) {
			
			return 2 + count8(n / 10);
			
		} else if (n % 10 == 8) {
			
			return 1 + count8(n / 10);
			
		} else {
			
			return count8(n / 10);
			
		}
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 88188;
		
		System.out.println(count8(n));
		
	}

}
