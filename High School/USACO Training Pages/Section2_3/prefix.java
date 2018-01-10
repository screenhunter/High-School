/*
rkhanna
Rajat Khanna
04/14/2014
PROG: prefix
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.TreeSet;

public class prefix {

	public static BufferedReader in;
	public static PrintWriter out;
	public static TreeSet<String> prim;
	public static String message;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("prefix.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("prefix.out")));
		prim = new TreeSet<String>();
		String line = in.readLine();
		String[] temp;
		while(!line.equals(".")) {
			
			temp = line.split(" ");
			for (String s: temp)
				prim.add(s);
			line = in.readLine();
			
		}
		
		message = "";
		line = in.readLine();
		while (line != null) {
			
			message += line;
			line = in.readLine();
			
		}
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}
	
	private static int dp(String cur) {
		
		int max = 0;
		
		for (String s: prim)
			if (s.length() <= cur.length() && cur.substring(0, s.length()).equals(s))
				 max = Math.max(max, s.length() + dp(cur.substring(s.length())));
		
		return max;
		
	}

}
