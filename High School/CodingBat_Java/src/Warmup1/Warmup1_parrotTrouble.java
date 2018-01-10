package Warmup1;
import java.io.IOException;

public class Warmup1_parrotTrouble {

	public static boolean parrotTrouble(boolean talking, int hour) {
		  
		boolean answer = false;
		
		if (talking == true) {
			
			if (hour < 7 || hour > 20) {
				
				answer = true;
				
			}
			
		}
		
		return answer;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		boolean talking = true;
		int hour = 7;
		
		System.out.println(parrotTrouble(talking, hour));

	}
	
}
