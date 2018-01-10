package Logic2;

import java.io.IOException;

public class Logic2_blackjack {
	
	public static int blackjack(int a, int b) {
		
		if (a > 21 && b > 21) {
			
			return 0;
			
		} else if (a > 21 && b <= 21) {
			
			return b;
			
		} else if (a <= 21 && b > 21) {
			
			return a;
			
		} else {
			
			if (21 - a <= 21 - b) {
				
				return a;
				
			} else {
				
				return b;
				
			}
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 19;
		
		System.out.println(blackjack(a, b));
		
	}

}
