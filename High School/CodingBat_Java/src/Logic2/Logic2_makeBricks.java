package Logic2;

import java.io.IOException;

public class Logic2_makeBricks {
	
	public static boolean makeBricks(int small, int big, int goal) {
		
		int total = 0;
		
		for (int i = 0; i < goal; i++) {
			
			if (total + 5 <= goal && big > 0) {
				
				total +=5;
				big--;
				
			} else if (total + 1 <= goal && small > 0) {
		
				total++;
				small--;
				
			} else if (total == goal) {
				
				return true;
		
			}
		
		}
		 
		if (total == goal) {
		
			return true;
		
		} else {
		
			return false;
		
		}
		
	}

	public static void main (String[] args) throws IOException {
		
		int small = 1;
		int big = 2;
		int goal = 2;
		
		System.out.println(makeBricks(small, big, goal));
		
	}

}
