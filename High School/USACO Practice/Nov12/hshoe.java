/*
PROG: hshoe
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class hshoe {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, max;
	public static char[][] grid;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("hshoe.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("hshoe.out")));

		N = Integer.parseInt(in.readLine());
		grid = new char[N][N];
		for (int i = 0; i < N; i++)
			grid[i] = in.readLine().toCharArray();

		out.println(recur(0, 0, 0, 0, false));

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static int recur(int right, int left, int r, int c, boolean end) {

		if (r >= N || r < 0 || c >= N || c < 0)
			return 0;

		if (grid[r][c] == '(') {

			if (end)
				return 0;
			left++;

		} else if (grid[r][c] == ')') {

			if (!end)
				end = true;

			right++;
			if (left - right == 0)
				return left + right;

		} else
			return 0;

		char temp = grid[r][c];
		grid[r][c] = 'x';

		int max = Math.max(
				Math.max(recur(right, left, r + 1, c, end),
						recur(right, left, r - 1, c, end)),
				Math.max(recur(right, left, r, c + 1, end),
						recur(right, left, r, c - 1, end)));

		grid[r][c] = temp;

		return max;

	}
}
