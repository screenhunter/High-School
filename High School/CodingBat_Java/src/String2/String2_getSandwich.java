package String2;

import java.io.IOException;

public class String2_getSandwich {
	
	public static String getSandwich(String str) {
		
		if (str.indexOf("bread") == str.lastIndexOf("bread")) {
			
			return "";
			
		} else {
			
			return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "abxbreadyzbread breadbask";
	
		System.out.println(getSandwich(str)); 

	}

}
