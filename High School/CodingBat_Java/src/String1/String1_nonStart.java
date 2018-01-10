package String1;

import java.io.IOException;

public class String1_nonStart {
	
	public static String nonStart(String a, String b) {
		
		String answer = "";
		
		a = a.substring(1);
		b = b.substring(1);
		
		answer = a + b;
		
		return answer;
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "H";
		String b = "F";
		
		System.out.println(nonStart(a, b)); 

	}

}
