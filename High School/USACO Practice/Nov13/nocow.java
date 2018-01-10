/*
rkhanna
Rajat Khanna
11/16/2013
PROG: nocow
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class nocow {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, K, adj;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("nocow.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("nocow.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]);
		
		
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
