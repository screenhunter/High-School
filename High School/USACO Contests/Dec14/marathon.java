/*
rkhanna 
Rajat Khanna
12/13/2014
prog: marathon
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class marathon {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, K;
	public static int[][] checkpoints;
	public static int[][] cache;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("marathon.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("marathon.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]);
		checkpoints = new int[N][2];
		cache = new int[N][K + 1];

		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			Arrays.fill(cache[i], -1);
			checkpoints[i][0] = Integer.parseInt(line[0]);
			checkpoints[i][1] = Integer.parseInt(line[1]);

		}
		
		out.println(dp(N - 1, K));
		
		for (int i = 0; i < N; i++)
			System.out.println(Arrays.toString(cache[i]));

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	private static int dp(int cur, int skips) {
		
		if (cache[cur][skips] > -1)
			return cache[cur][skips];
		
		if (cur <= 0)
			return 0;
		
		if (skips >= cur)
			return -1;
		
		int a = Integer.MAX_VALUE;
		if (skips > 0)
			a = dp(cur, skips-1);
		if (a == -1)
			a = Integer.MAX_VALUE;
		
		for (int i = 0; i <= skips; i++)
			if (cur - i - 1 >= 0) {
				
				int temp = dp(cur - i - 1, skips - i);
				if (temp == -1)
					continue;
				
				a = Math.min(a, temp + dist(cur, cur - i - 1));
				
			}
		
		cache[cur][skips] = a;
		
		return cache[cur][skips];
		
	}

	private static int dist(int a, int b) {

		return Math.abs(checkpoints[a][0] - checkpoints[b][0])
				+ Math.abs(checkpoints[a][1] - checkpoints[b][1]);

	}

}
