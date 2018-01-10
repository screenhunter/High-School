package String2;

import java.io.IOException;

public class String2_mixString {
	
	public static String mixString(String a, String b) {
		
		String str = "";
		String newA = a;
		String newB = b;
		
		
		for (int i = 0; i < a.length() && i < b.length(); i++) {
			
			str = str + a.charAt(i) + "" + b.charAt(i);
			newA = newA.replaceFirst(newA.charAt(0) + "", "");
			newB = newB.replaceFirst(newB.charAt(0) + "", "");
			
		}
		
		return str + newA + newB;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "hello";
		String b = "hi";
	
		System.out.println(mixString(a, b)); 

	}

}
