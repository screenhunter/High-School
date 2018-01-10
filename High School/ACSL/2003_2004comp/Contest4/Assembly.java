package Contest4;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #4 2003-2004
 * ASSEMBLY
 */

import java.util.*;
import java.io.*;

public class Assembly {

	private static final String A = "ADD";
	private static final String S = "SUB";
	private static final String M = "MULT";
	private static final String D = "DIV";
	private static final String E = "END";
	private static final String P = "PRINT";
	private static final String DC = "DC";
	private static final String ST = "STORE";
	private static final String L = "LOAD";
	private static int ACC;
	private static HashMap<Character, Integer> values;
	
	public static void main(String[] args) throws IOException {
		
		values = new HashMap<Character, Integer>();
		ACC = 0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the data seperated by 1 space");
		
		int count = 1;
		
		while (true) {
			
			String line = in.readLine();
			
			if (line.contains(A))
				ACC += values.get(line.charAt(line.length() - 1));
			else if (line.contains(S))
				ACC -= values.get(line.charAt(line.length() - 1));
			else if (line.contains(M))
				ACC *= values.get(line.charAt(line.length() - 1));
			else if (line.contains(D))
				ACC /= values.get(line.charAt(line.length() - 1));
			else if (line.contains(P)) {
				
				System.out.println(count + ". " + values.get(line.charAt(line.length() - 1)));
				count++;
				
			} else if (line.contains(DC))
				values.put(line.charAt(0), Integer.parseInt(line.charAt(line.length() - 1) + ""));
			else if (line.contains(ST))
				values.put(line.charAt(line.length() - 1), ACC);
			else if (line.contains(L))
				ACC = values.get(line.charAt(line.length() - 1));
			else if (line.contains(E))
				break;
			
		}

	}
	
	

}
