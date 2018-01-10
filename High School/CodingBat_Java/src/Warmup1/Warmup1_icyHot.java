package Warmup1;

import java.io.IOException;

public class Warmup1_icyHot {
	
	public static boolean icyHot(int temp1, int temp2) {
		
		boolean answer = false;
		
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int temp1 = 101;
		int temp2 = -100;
		
		System.out.println(icyHot(temp1, temp2)); 

	}

}
