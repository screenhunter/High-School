package Warmup1;
import java.io.IOException;

public class Warmup1_makes10 {
	
	public static boolean makes10(int a, int b) {
		
		boolean answer = false;
		
		if (a == 10 || b==10) {
			
			answer = true;
			
		}
		
		if (a+b == 10) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 10;
		int b = 5;
		
		System.out.println(makes10(a, b));

	}

}
