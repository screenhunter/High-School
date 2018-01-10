/*
PROG: hardprob
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class hardprob {

	public static BufferedReader in;
	public static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("hardprob.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("hardprob.out")));
		
		out.println("You suck Sreenath");
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
