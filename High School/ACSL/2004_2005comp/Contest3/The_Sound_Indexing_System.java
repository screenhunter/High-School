package Contest3;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #3 2004-2005
 * The Sound Indexing System
 */

import java.io.*;

public class The_Sound_Indexing_System {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int counter = 0; counter < 5; counter++) {
			
			System.out.println("Please enter the input:");
			
			String word = in.readLine().toUpperCase();
			char x = word.charAt(0);
			String result = "";
			word = word.substring(1);
			
			word = word.replaceAll("A", "");
			word = word.replaceAll("E", "");
			word = word.replaceAll("I", "");
			word = word.replaceAll("O", "");
			word = word.replaceAll("U", "");
			word = word.replaceAll("H", "");
			word = word.replaceAll("W", "");
			word = word.replaceAll("Y", "");
			
			word = word + "000";
			result = result + word.substring(0, 3);
			
			for (int i = 0; i < result.length(); i++) {
				
				if ("BFPV".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "1" + result.substring(i+1);
				else if ("CGJKQSXZ".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "2" + result.substring(i+1);
				else if ("DT".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "3" + result.substring(i+1);
				else if ("L".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "4" + result.substring(i+1);
				else if ("MN".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "5" + result.substring(i+1);
				else if ("R".contains(result.charAt(i) + ""))
					result = result.substring(0, i) + "6" + result.substring(i+1);
				
			}
			
			System.out.println(x + result);
			
		}
		
	}

}
