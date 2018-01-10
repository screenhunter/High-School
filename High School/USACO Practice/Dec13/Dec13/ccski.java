package Dec13;
/*
rkhanna
Rajat Khanna
01/20/2014
PROG: ccski
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ccski {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int M, N;
	public static int[][] grid;
	public static int[][] points;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("ccski.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("ccski.out")));

		String[] line = in.readLine().split(" ");
		M = Integer.parseInt(line[0]);
		N = Integer.parseInt(line[1]);
		grid = new int[M][N];
		points = new int[M][N];

		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			for (int j = 0; j < N; j++)
				grid[i][j] = Integer.parseInt(line[j]);

		}

		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			for (int j = 0; j < N; j++)
				points[i][j] = Integer.parseInt(line[j]);

		}
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}
	
	public static boolean test(int D, int i, int j, int prev) {
		
		if (i >= M || j >= N)
			return false;
		
		if (Math.abs(prev - grid[i][j]) <= D) {
			
			return test(D, i+1, j, grid[i][j]) || test(D, i, j+1, grid[i][j]);
			
		}
		
		return false;
			
	}

}
