package Logic1;

import java.io.IOException;

public class Logic1_maxMod5 {
	
	public static int maxMod5(int a, int b) {
		
		if (a == b) {
			
			return 0;
			
		}
		
		if (a % 5 != b % 5) {
			
			if (a > b) {
				
				return a;
				
			} else if (b > a) {
				
				return b;
				
			}
			
		} else {
			
			if (a > b) {
				
				return b;
				
			}
			
		}
		
		return a;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 6;
		int b = 6;
		
		System.out.println(maxMod5(a, b));
		
	}

}
