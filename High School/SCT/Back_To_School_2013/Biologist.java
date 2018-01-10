/*
PROG: A
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Biologist {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static final int[] dashes = new int[]{0, 2, 3, 4, 4, 4, 3, 2, 0};
	public static final int[] spaces = new int[]{1, 0, 0, 0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0, 0, 0, 1};
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("A.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		
		N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			
			String line = in.readLine().replaceAll("T", "U");
			char temp = line.charAt(1);
			line = line.charAt(0) + "";
			for (int j = 0; j < dashes[i % 9]; j++)
				line += "-";
			for (int j = 0; j < spaces[i % 18]; j++)
				line = " " + line;
			line += temp;
			out.println(line);
			
		}
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
