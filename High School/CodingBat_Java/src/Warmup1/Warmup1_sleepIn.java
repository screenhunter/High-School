package Warmup1;
import java.io.IOException;

public class Warmup1_sleepIn {

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  
		boolean answer = false; 
		
		if (weekday == vacation) {
			  
			answer = true;
			  
		} else if (weekday == false && vacation == true) {
			
			answer = true;
			
		}
		
		return answer;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		boolean weekday = true;
		boolean vacation = false;
		
		System.out.println(sleepIn(weekday, vacation));

	}
	
}
