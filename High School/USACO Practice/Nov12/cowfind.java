/*
PROG: cowfind
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class cowfind {

	public static BufferedReader in;
	public static PrintWriter out;
	public static String grass;
	public static int hind, sum;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("cowfind.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cowfind.out")));

		grass = in.readLine();
		hind = 0;
		
		
		for (int i = 0; i < grass.length() - 1; i++) {

			if (grass.subSequence(i, i + 2).equals("(("))
				hind++;
			if (grass.subSequence(i, i + 2).equals("))"))
				sum += hind;

		}
		
		out.println(sum);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
