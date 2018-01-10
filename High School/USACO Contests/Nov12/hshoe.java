
/*
 rkhanna
 Rajat Khanna
 11/17/2012
 PROG: hshoe
 LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class hshoe {

	public static int fill(char[][] g, int r, int c, char prev, int xcount,
			int ycount) // recursive method
	{

		if (c >= g[0].length || c < 0)
			return 0;

		if (r >= g.length || r < 0)
			return 0;

		if (g[r][c] == '*')
			return 0;

		if (prev == ')' && g[r][c] == '(')
			return 0;

		if (g[r][c] == '(')
			xcount++;
		else {

			ycount++;
			if (ycount == xcount)
				return xcount + ycount;

		}

		char temp = g[r][c];

		g[r][c] = '*';

		int num1 = fill(g, r + 1, c, temp, xcount, ycount);
		int num2 = fill(g, r, c + 1, temp, xcount, ycount);
		int num3 = fill(g, r - 1, c, temp, xcount, ycount);
		int num4 = fill(g, r, c - 1, temp, xcount, ycount);

		g[r][c] = temp;

		int max = num1;

		if (max < num2)
			max = num2;

		if (max < num3)
			max = num3;

		if (max < num4)
			max = num4;

		return max;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("hshoe.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"hshoe.out")));

		int N = Integer.parseInt(in.readLine());

		char[][] grid = new char[N][N];

		for (int i = 0; i < N; i++)
			grid[i] = in.readLine().toCharArray();

		if (grid[0][0] == ')')
			out.println(0);
		else
			out.println(fill(grid, 0, 0, grid[0][0], 0, 0));

		in.close();
		out.close();
		System.exit(0);

	}

}
