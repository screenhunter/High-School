package Logic2;

import java.io.IOException;

public class Logic2_roundSum {
	
	public static int roundSum(int a, int b, int c) {
		
		return round10(a) + round10(b) + round10(c);
		  
	}
	
	public static int round10(int num) {
		
		if (num % 10 < 5) {
			
			return num - (num % 10);
			
		} else {
			
			return num + (10 - (num % 10));
			
		}
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 23;
		int c = 23;
		
		System.out.println(roundSum(a, b, c));
		
	}

}
