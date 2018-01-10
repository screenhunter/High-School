/*
prog: USACO
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class USACO {
	
	public static BufferedReader in;
	public static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("USACO.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("USACO.out")));
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
