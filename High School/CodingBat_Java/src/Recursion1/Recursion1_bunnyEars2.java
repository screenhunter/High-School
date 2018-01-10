package Recursion1;

import java.io.IOException;

public class Recursion1_bunnyEars2 {
	
	public static int bunnyEars2(int bunnies) {
		
		if (bunnies == 0) {
			
			return 0;
			
		} else if (bunnies % 2 == 0) {
			
			return 3 + bunnyEars2(bunnies - 1);
			
		} else {
			
			return 2 + bunnyEars2(bunnies - 1);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 2;
		
		System.out.println(bunnyEars2(n));
		
	}

}
