/*
rkhanna
Rajat Khanna
12/14/2013
PROG: baseball
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class baseball {

	public static BufferedReader in;
	public static PrintWriter out;
	public static boolean[] cows;
	public static int N, count;
	public static int[] index;

	private static void compute() {

		for (int a = 0; a < N; a++)
			for (int b = a + 1; b < N; b++) {

				int distance = index[b] - index[a];

				for (int c = b + 1; c < N; c++)

					if (index[c] < index[b] + distance)
						continue;
					else if (index[c] > index[b] + 2 * distance)
						break;
					else
						count++;

			}

	}

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("baseball.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("baseball.out")));
		N = Integer.parseInt(in.readLine());
		cows = new boolean[100000001];
		index = new int[N];
		count = 0;

		for (int i = 0; i < N; i++) {

			index[i] = Integer.parseInt(in.readLine());
			cows[index[i]] = true;

		}
		Arrays.sort(index);

		compute();
		out.println(count);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}
}
