/*
PROG: preface
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class preface {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int[] counts;
	public static int N;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("preface.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("preface.out")));

		N = Integer.parseInt(in.readLine());
		counts = new int[7];

		for (int i = 1; i <= N; i++)
			split(i);
		
		print();
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void print() {

		if (counts[0] != 0)
			out.println("I" + " " + counts[0]);
		if (counts[1] != 0)
			out.println("V" + " " + counts[1]);
		if (counts[2] != 0)
			out.println("X" + " " + counts[2]);
		if (counts[3] != 0)
			out.println("L" + " " + counts[3]);
		if (counts[4] != 0)
			out.println("C" + " " + counts[4]);
		if (counts[5] != 0)
			out.println("D" + " " + counts[5]);
		if (counts[6] != 0)
			out.println("M" + " " + counts[6]);
		
	}

	private static void split(int x) {

		int pow = 0;
		while (x > 0) {

			calc(x % 10, pow);
			x = x / 10;
			pow++;

		}

	}

	private static void calc(int i, int pow) {
			
		if (i <= 3)
			counts[2*pow] += i;
		else if (i == 4) {
			
			counts[2*pow] += 1;
			counts[2*pow+1] += 1;
			
		} else if (i <= 8) {
			
			counts[2*pow] += i - 5;
			counts[2*pow+1] += 1;
			
		} else if (i == 9) {
			
			counts[2*pow] += 1;
			counts[2*(pow + 1)] += 1;
			
		}
		
	}
}
