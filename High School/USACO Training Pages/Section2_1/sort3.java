/*
PROG: sort3
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class sort3 {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, count;
	public static int[] orig, fin;
	public static int[][] swaps;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("sort3.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("sort3.out")));
		
		N = Integer.parseInt(in.readLine());
		
		orig = new int[N];
		fin = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			orig[i] = Integer.parseInt(in.readLine());
			fin[i] = orig[i];
			
		}
		
		Arrays.sort(fin);
		swaps = new int[3][2];
		compare();
		compute();
		
		out.println(count);
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void compute() {
		
		count = 0;
		
		for (int i = 0; i < 3; i++) {
			
			int temp = Math.min(swaps[i][0], swaps[i][1]);
			count += temp;
			swaps[i][0] -= temp;
			swaps[i][1] -= temp;
			
		}
		
		count += swaps[0][0]*2 + swaps[0][1]*2;
		
	}

	private static void compare() {

		for (int i = 0; i < N; i++) {
			
			if (orig[i] == fin[i])
				continue;
			else if (orig[i] == 1 && fin[i] == 2)
				swaps[0][0]++;
			else if (orig[i] == 2 && fin[i] == 1)
				swaps[0][1]++;
			else if (orig[i] == 1 && fin[i] == 3)
				swaps[1][0]++;
			else if (orig[i] == 3 && fin[i] == 1)
				swaps[1][1]++;
			else if (orig[i] == 2 && fin[i] == 3)
				swaps[2][0]++;
			else if (orig[i] == 3 && fin[i] == 2)
				swaps[2][1]++;
			
		}
		
	}

}
