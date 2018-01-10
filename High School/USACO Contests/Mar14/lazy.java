/*
rkhanna
Rajat Khanna
03/08/2014
PROG: lazy
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class lazy {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, K, max;
	public static int[][] grid;
	
	public static void main(String[] args) throws Exception {
		
		//long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("lazy.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("lazy.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]);
		max = 0;
		grid = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			for (int j = 0; j < N; j++)
				grid[i][j] = Integer.parseInt(line[j]);
			
		}
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				max = Math.max(max, test(i, j));
		
		out.println(max);
		
		in.close();
		out.close();
		
		//long endTime = System.nanoTime();
		//System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static int test(int x, int y) {
		
		int sum = 0;
		
		for (int i = x - K; i <= x + K; i++)
			if (i >= 0 && i < N)
				for (int j = y - (K - Math.abs(x - i)); j <= y + (K - Math.abs(x - i)); j++)
					if (j < N && j >= 0)
						sum += grid[i][j];
		
		return sum;
		
	}

}
