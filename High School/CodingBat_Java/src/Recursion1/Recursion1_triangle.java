package Recursion1;

import java.io.IOException;

public class Recursion1_triangle {
	
	public static int triangle(int rows) {
		
		if (rows == 0) {
			
			return 0;
			
		} else {
			
			return rows + triangle(rows - 1);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 10;
		
		System.out.println(triangle(n));
		
	}

}
