package Logic1;

import java.io.IOException;

public class Logic1_sortaSum {
	
	public static int sortaSum(int a, int b) {
		
		if (a + b >= 10 && a + b <= 19) {
			
			a = 10;
			b = 10;
			
		}
		
		return a+b;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 50;
		int b = -34;
		
		System.out.println(sortaSum(a, b));
		
	}

}
