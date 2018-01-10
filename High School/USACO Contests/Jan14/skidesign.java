/*
rkhanna
Rajat Khanna
01/11/2014
PROG: skidesign
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class skidesign {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, cost;
	public static int[] hills;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("skidesign.in"));
		out = new PrintWriter(new BufferedWriter(
				new FileWriter("skidesign.out")));

		N = Integer.parseInt(in.readLine());
		hills = new int[N];
		for (int i = 0; i < N; i++)
			hills[i] = Integer.parseInt(in.readLine());

		Arrays.sort(hills);

		// find the difference between max and min and how far it is from 17
		int dif = hills[N - 1] - hills[0] - 17;

		// find which case
		if (dif > 0)
			if (dif % 2 == 0)
				case1(dif);
			else
				case2(dif);
		else
			out.println(0);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	// if even, then just move both ends an equal amount
	private static void case1(int dif) {

		// center case
		int pos = 0;
		int thresh = hills[0] + dif / 2;

		while (hills[pos] < thresh) {

			cost += Math.pow(thresh - hills[pos], 2);
			pos++;

		}

		pos = N - 1;
		thresh = hills[pos] - dif / 2;

		while (hills[pos] > thresh) {

			cost += Math.pow(hills[pos] - thresh, 2);
			pos--;

		}
		
		cost = Math.min(cost, left_and_right(dif));

		out.println(cost);

	}

	private static void case2(int dif) {

		// center case
		int pos = 0;
		int thresh = hills[0] + dif / 2;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;

		while (hills[pos] < thresh) {

			a1 += Math.pow(thresh - hills[pos], 2);
			pos++;

		}

		thresh++;
		pos = 0;
		while (hills[pos] < thresh) {

			a2 += Math.pow(thresh - hills[pos], 2);
			pos++;

		}

		pos = N - 1;
		thresh = hills[pos] - dif / 2;

		while (hills[pos] > thresh) {

			b1 += Math.pow(hills[pos] - thresh, 2);
			pos--;

		}

		thresh--;
		pos = N - 1;
		while (hills[pos] > thresh) {

			b2 += Math.pow(thresh - hills[pos], 2);
			pos--;

		}

		cost += Math.min(a1 + b2, a2 + b1);
		
		cost = Math.min(cost, left_and_right(dif));

		out.println(cost);

	}

	private static int left_and_right(int dif) {

		// left case
		int pos = 0;
		int thresh = hills[0] + dif;
		int a = 0;
		
		while (hills[pos] < thresh) {

			a += Math.pow(thresh - hills[pos], 2);
			pos++;

		}

		// right case
		pos = N - 1;
		thresh = hills[pos] - dif;
		int b = 0;

		while (hills[pos] > thresh) {

			b += Math.pow(hills[pos] - thresh, 2);
			pos--;

		}

		return Math.min(a, b);

	}

}
