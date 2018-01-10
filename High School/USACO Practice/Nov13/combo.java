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
	public static int[] f, m;
	public static boolean[][][] keys;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("combo.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));

		N = Integer.parseInt(in.readLine());
		f = new int[3];
		m = new int[3];
		keys = new boolean[N + 1][N + 1][N + 1];

		String[] line = in.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			f[i] = Integer.parseInt(line[i]);

		line = in.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			m[i] = Integer.parseInt(line[i]);

		count = 0;
		findKeys(f);
		findKeys(m);

		out.println(count);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void findKeys(int[] array) {

		for (int a = array[0] - 2; a <= array[0] + 2; a++)
			for (int b = array[1] - 2; b <= array[1] + 2; b++)
				for (int c = array[2] - 2; c <= array[2] + 2; c++) {

					if (keys[(a + N) % N][(b + N) % N][(c + N) % N])
						continue;

					keys[(a + N) % N][(b + N) % N][(c + N) % N] = true;
					count++;

				}

	}

}
