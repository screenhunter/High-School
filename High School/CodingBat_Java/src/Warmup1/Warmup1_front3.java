package Warmup1;
import java.io.IOException;

public class Warmup1_front3 {
	
	public static String front3(String str) {
		
		String answer = "";
		
		if (str.length() > 3) {
			
			str = str.substring(0, 3);
			
		}
		
		answer = str + str + str;
		
		return answer;
		  
	}

	public static void main (String[] args) throws IOException {
		
		String str = "hi";
		
		System.out.println(front3(str)); 

	}
	
}
