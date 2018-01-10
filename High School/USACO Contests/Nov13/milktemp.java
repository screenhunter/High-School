/*
rkhanna
Rajat Khanna
11/16/2013
PROG: milktemp
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class milktemp {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int[] imp;
	public static int[][] cows;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("milktemp.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("milktemp.out")));

		imp = new int[4];
		String[] line = in.readLine().split(" ");
		for (int i = 0; i < 4; i++)
			imp[i] = Integer.parseInt(line[i]);

		cows = new int[imp[0]][2];
		for (int i = 0; i < imp[0]; i++) {

			line = in.readLine().split(" ");
			cows[i][0] = Integer.parseInt(line[0]);
			cows[i][1] = Integer.parseInt(line[1]);

		}

		// Set the values of cows here

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < imp[0]; i++) {
			hs.add(cows[i][0]);
			hs.add(cows[i][1]);
		}

		int maxG = 0;
		for (Iterator<Integer> itr = hs.iterator(); itr.hasNext();) {
			int temp = itr.next();
			int g = 0;
			for (int j = 0; j < imp[0]; j++) {
				if (temp < cows[j][0]) {
					g += imp[1];
				} else if (temp > cows[j][1]) {
					g += imp[3];
				} else {
					g += imp[2];
				}
			}
			if (maxG < g) {
				maxG = g;
			}
		}

		out.println(maxG);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
