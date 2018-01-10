package Dec13;
/*
rkhanna
Rajat Khanna
XX/XX/2014
PROG: name
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class shuffle {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M, Q;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("shuffle.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		Q = Integer.parseInt(line[2]);
		
		
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
