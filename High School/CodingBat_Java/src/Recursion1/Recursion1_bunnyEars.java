package Recursion1;

import java.io.IOException;

public class Recursion1_bunnyEars {
	
	public static int bunnyEars(int bunnies) {
		
		return bunnies + bunnies;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int bunnies = 4;
		
		System.out.println(bunnyEars(bunnies));
		
	}

}
