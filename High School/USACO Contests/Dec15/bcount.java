/*
prog: bcount
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bcount {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, Q, a ,b ;
	public static int[][] cows;
	
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("bcount.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		Q = Integer.parseInt(line[1]);
		cows = new int[N + 1][3];
		
		for (int i = 1; i <= N; i++) {
			
			for (int j = 0; j < 3; j++)
				cows[i][j] = cows[i-1][j];
			
			int type = Integer.parseInt(in.readLine())-1;
			cows[i][type] = cows[i-1][type] + 1;
			
		}
		
		for (int i = 0; i < Q; i++) {
			
			line = in.readLine().split(" ");
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			out.println((cows[b][0] - cows[a-1][0]) + " " + (cows[b][1] - cows[a-1][1]) + " " + (cows[b][2] - cows[a-1][2]));
			
		}
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
