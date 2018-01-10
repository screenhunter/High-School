/*
rkhanna
Rajat Khanna
11/16/2013
PROG: combo
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class combo {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, count;
	public static int[][] keys;
	public static boolean[][][] combos;

	public static void casework(int x) {

		for (int i = keys[0][x] - 2; i <= keys[0][x] + 2; i++)
			for (int j = keys[1][x] - 2; j <= keys[1][x] + 2; j++)
				for (int k = keys[2][x] - 2; k <= keys[2][x] + 2; k++) {

					int a = i, b = j, c = k;
					if (a <= 0)
						a = N + i;
					if (b <= 0)
						b = N + j;
					if (c <= 0)
						c = N + k;

					if (!combos[a][b][c])
						count++;

					combos[a][b][c] = true;

				}

	}

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("combo.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));

		N = Integer.parseInt(in.readLine());
		keys = new int[3][2];

		// get keys
		String[] line = in.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			keys[i][0] = Integer.parseInt(line[i]);
		line = in.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			keys[i][1] = Integer.parseInt(line[i]);

		count = 0;
		combos = new boolean[N + 1][N + 1][N + 1];

		// check for valid combos
		if (N > 5) {

			casework(0);
			casework(1);

		} else
			count = N * N * N;
		// if N <= 5, then any combination works

		out.println(count);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
