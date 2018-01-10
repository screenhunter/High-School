
/*
PROB: skidesign
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class skidesign {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, max, min;
	public static int[] hills;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("skidesign.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));

		N = Integer.parseInt(in.readLine());
		hills = new int[N];
		max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {

			hills[i] = Integer.parseInt(in.readLine());
			max = Math.max(max, hills[i]);

		}

		int min = Integer.MAX_VALUE;
		for (int j = 0; j <= max - 17; j++) {

			int cost = 0;

			for (int i = 0; i < N; i++) {
				if (hills[i] < j)
					cost += (hills[i] - j) * (hills[i] - j);
				else if (hills[i] > j + 17)
					cost += (hills[i] - j - 17) * (hills[i] - j - 17);
			}
			
			min = Math.min(min, cost);

		}

		out.println(min);

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
