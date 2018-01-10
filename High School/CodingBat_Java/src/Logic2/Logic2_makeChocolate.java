package Logic2;

import java.io.IOException;

public class Logic2_makeChocolate {
	
	public static int makeChocolate(int small, int big, int goal) {
		
		int total = 0;
		
		if(goal < 5) {
		
			big = -1;
		
		}
		 
		for(int i = 0; i < big; i++) {
		
			total += 5;
		 
			if(total == goal) {
		
				return 0;
		
			} else if(total + 5 > goal) {
		
				break;
		
			}
		
		}
		 
		for(int i = 1; i <= small; i++) {
		
			total++;
		
			if(total == goal) {
		
				return i;
		
			}
		
		}
		 
		return -1;
		
	}

	public static void main (String[] args) throws IOException {
		
		int small = 1;
		int big = 2;
		int goal = 2;
		
		System.out.println(makeChocolate(small, big, goal));
		
	}
	
}
