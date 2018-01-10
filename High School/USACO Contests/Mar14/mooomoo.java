/*
rkhanna
Rajat Khanna
03/08/2014
PROG: mooomoo
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class mooomoo {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, B, count;
	public static int[] cow;
	public static int[] cache;

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("mooomoo.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("mooomoo.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		B = Integer.parseInt(line[1]);
		cow = new int[B];
		cache = new int[10001];
		Arrays.fill(cache, -1);
		count = 0;
		cache[0] = 0;

		for (int i = 0; i < B; i++) {

			cow[i] = Integer.parseInt(in.readLine());
			cache[cow[i]] = 1;

		}

		int prev = 0;
		int x;
		for (int i = 0; i < N; i++) {

			if (prev > 0)
				prev--;

			x = Integer.parseInt(in.readLine());
			count += findMin(x - prev);

			if (cache[x - prev] > 100000)
				exit();

			if (x > prev)
				prev += x - prev;

		}

		out.println(count);

		in.close();
		out.close();

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void exit() throws Exception {

		out.println(-1);

		in.close();
		out.close();
		System.exit(0);

	}

	private static int findMin(int vol) {

		if (vol < 0)
			return 100001;

		if (cache[vol] != -1)
			return cache[vol];

		int min = 100001;
		for (int i = 0; i < B; i++)
			min = Math.min(min, findMin(vol - cow[i]) + 1);

		cache[vol] = min;

		return min;

	}

}
