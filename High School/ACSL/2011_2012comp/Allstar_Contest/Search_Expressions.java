package Allstar_Contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * All-Star Contest #4 2011-2012
 * Search Expressions
 */

public class Search_Expressions {
	
	private static String operators = "[]?*+&";

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> words = new ArrayList<String>();
		
		System.out.println("Please enter the input seperated by commas and/or spaces:");
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		while (st.hasMoreTokens())
			words.add(st.nextToken());
		
		for (int counter = 1; counter <= 10; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");
			
			String line = in.readLine();
			
			String cur = "";
			
			

		}

		in.close();

	}

}

