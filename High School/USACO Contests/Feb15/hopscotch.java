/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: hopscotch
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class hopscotch {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int R, C;
	public static int[][] cache;
	public static String[][] grid;
	
	public static void main(String[] args) throws Exception {
		
		//long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("hopscotch.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("hopscotch.out")));
		
		String[] line = in.readLine().split(" ");
		R = Integer.parseInt(line[0]);
		C = Integer.parseInt(line[1]);
		cache = new int[R][C];
		grid = new String[R][C];
		
		for (int i = 0; i < R; i++) {
			grid[i] = in.readLine().split(" ");
			Arrays.fill(cache[i], 0);
		}
		
		cache[R-1][C-1] = 1;
		
		for (int i = R-2; i > 0; i--)
			for (int j = C-2; j > 0; j--)
				sum(i, j, grid[i][j]);
		
		sum(0, 0, grid[0][0]);
		
		cache[0][0] = (cache[0][0] % 1000000007);
		
		out.println(cache[0][0]);
		
		//System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static void sum(int x, int y, String cha) {
		
		for (int a = x+1; a < R; a++)
			for (int b = y+1; b < C; b++)
				if (!cha.equals(grid[a][b])) {
					cache[x][y] += cache[a][b];
					cache[x][y] = (cache[x][y] % 1000000007);
				}
		
	}

}
