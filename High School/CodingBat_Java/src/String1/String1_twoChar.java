package String1;

import java.io.IOException;

public class String1_twoChar {
	
	public static String twoChar(String str, int index) {
		
		String answer = "";
		
		if (str.length()-2 >= index && index >= 0) {
			
			answer = str.substring(index, index+2);
			
		} else {
			
			answer = str.substring(0, 2);
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		int n = 2;
	
		System.out.println(twoChar(str, n)); 

	}

}
