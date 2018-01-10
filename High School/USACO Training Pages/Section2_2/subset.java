/*
PROG: subset
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class subset {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static long[][] sums;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("subset.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("subset.out")));

		N = Integer.parseInt(in.readLine());
		sums = new long[N + 1][N * (N + 1) / 4 + 1];
		
		for (long[] x: sums)
			Arrays.fill(x, -1);
			
		
		for (int i = 0; i < N + 1; i++)
			sums[i][0] = 1;
		
		if ((N * (N + 1)) % 4 != 0)
			out.println(0);
		else
			out.println(calc(N * (N + 1) / 4, N) / 2);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	// f(n, k) = f(n, k-1) + f(n-k, k-1) n = sum; k = current number

	private static long calc(int sum, int x) {
		
		if (sum < 0 || x < 0)
			return 0;

		if (sums[x][sum] != -1)
			return sums[x][sum];

		sums[x][sum] = calc(sum, x - 1) + calc(sum - x, x - 1);
		return sums[x][sum];

	}
}
