package Warmup1;
import java.io.IOException;

public class Warmup1_nearHundred {
	
	public static boolean nearHundred(int n) {
		
		boolean answer = false;
		
		if (Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10) {
			
			answer = true;
			
		}
		
		return answer;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 99;
		
		System.out.println(nearHundred(n));

	}
	
}
