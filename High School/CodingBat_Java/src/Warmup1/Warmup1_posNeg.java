package Warmup1;
import java.io.IOException;

public class Warmup1_posNeg {
	
	public static boolean posNeg(int a, int b, boolean negative) {
		
		boolean answer = false;
		
		if (negative == false) {
			
			if (a > 0 && b < 0) {
				
				answer = true;
				
			} else if (a < 0 && b > 0) {
				
				answer = true;
				
			}
			
		} else {
			
			if (a < 0 && b < 0) {
				
				answer = true;
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = -1;
		int b = -1;
		boolean negative = true;
		
		System.out.println(posNeg(a, b, negative));

	}

}
