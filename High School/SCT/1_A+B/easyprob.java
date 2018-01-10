/*
PROG: easyprob
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class easyprob {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("easyprob.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("easyprob.out")));
		
		N = Integer.parseInt(in.readLine());
		
		int sum = 0;
		for (int i = 0; i < N; i++)
			sum += Integer.parseInt(in.readLine());
		
		out.println(sum);
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
