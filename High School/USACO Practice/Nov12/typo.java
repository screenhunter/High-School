/*
rkhanna
Rajat Khanna
12/15/2012
PROG: typo
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class typo {

	public static BufferedReader in;
	public static PrintWriter out;
	public static String line;
	public static int left, right, count;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("typo.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("typo.out")));

		line = in.readLine();
		left = 0;
		right = 0;
		count = 0;
		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == '(') {
				
				left++;
				count++;
				
			} else
				right++;

			if (left - right <= 1)
				count = 0;

			if (left - right < 0) {

				count = right;
				break;

			}

		}

		out.println(count);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
