/*
PROG: nocows
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class nocows {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, K;
	public static int[][] cases, smalltrees;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("nocows.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("nocows.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]);
		cases = new int[N + 1][K + 1];
		smalltrees = new int[N + 1][K + 1];

		for (int i = 0; i < N + 1; i++) {

			Arrays.fill(cases[i], -1);
			Arrays.fill(smalltrees[i], -1);

		}

		cases[1][1] = 1;
		if (N >= 3 && K >= 2)
			cases[3][2] = 1;

		smalltrees[1][1] = 1;
		if (N >= 3 && K >= 2)
			smalltrees[3][2] = 1;
		
		out.println(build(N, K) % 9901);
		
		for (int[] x: cases)
			System.out.println(Arrays.toString(x));
		
		System.out.println();

		for (int[] x: smalltrees)
			System.out.println(Arrays.toString(x));
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static int build(int nodes, int height) {

		if (nodes <= 0 || height <= 0)
			return 0;

		if (cases[nodes][height] != -1)
			return cases[nodes][height];

		if (nodes % 2 == 0 || (nodes == 1 && height != 1) || (nodes == 3 && height != 2)) {

			cases[nodes][height] = 0;
			return 0;

		}

		cases[nodes][height] = 0;
		nodes--;

		for (int i = 1; i < nodes; i += 2) {

			cases[nodes+1][height] += build(i, height - 1)
					* build(nodes - i, height - 1);

			cases[nodes+1][height] += build(i, height - 1)
					* little(nodes - i, height - 1) * 2;

		}

		return cases[nodes + 1][height];
	}

	private static int little(int nodes, int height) {

		if (nodes <= 0 || height <= 0)
			return 0;

		if (smalltrees[nodes][height] != -1)
			return smalltrees[nodes][height];

		if (nodes % 2 == 0) {

			smalltrees[nodes][height] = 0;
			return 0;

		}

		if (nodes == 1) {

			smalltrees[nodes][height] = 1;
			return 1;

		}

		if (nodes == 3)
			if (height >= 2) {

				smalltrees[nodes][height] = 1;
				return 1;

			} else {

				smalltrees[nodes][height] = 1;
				return 1;

			}
		
		smalltrees[nodes][height] = 0;
		nodes--;

		for (int i = 1; i < nodes; i += 2)
			smalltrees[nodes+1][height] += little(i, height - 1)
					* little(nodes - i, height - 1)*2;

		return smalltrees[nodes+1][height];

	}

}
