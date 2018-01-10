/*
rkhanna
Rajat Khanna
02/06/2014
PROG: scode
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class scode {

	public static BufferedReader in;
	public static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("scode.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("scode.out")));
		
		String line = in.readLine();
		
		out.println((int)Math.pow(line.length() - 3, 3));
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
