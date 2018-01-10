/*
PROB: wormhole
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class wormhole {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int[][] coor;
	public static int[] next;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("wormhole.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("wormhole.out")));
		
		N = Integer.parseInt(in.readLine());
		coor = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			
			String[] line = in.readLine().split(" ");
			coor[i][0] = Integer.parseInt(line[0]);
			coor[i][1] = Integer.parseInt(line[1]);
			
		}
		
		next = new int[N];
		Arrays.fill(next, -1);
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (coor[i][1] == coor[j][1] && coor[i][0] < coor[j][0])
					if (next[i] == -1 || coor[j][0] - coor[i][0] < coor[next[i]][0] - coor[i][0])
						next[i] = j;
		
		int[] empty = new int[N];
		Arrays.fill(empty, -1);
		
		out.println(recur(empty));
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

	private static int recur(int[] config) {
		
		int index = -1;
		
		for (int i = 0; i < N; i++)
			if (config[i] == -1) {
				index = i;
				break;
			}
		
		if (index == -1)
			return test(config);
		
		int sum = 0;
		
		for (int j = index + 1; j < N; j++)
			if (config[j] == -1) {
				
				config[j] = index;
				config[index] = j;
				sum += recur(config);
				config[j] = -1;
				config[index] = -1;
				
			}
		
		return sum;
		
	}

	private static int test(int[] config) {
		
		for (int i = 0; i < N; i++) {
			
			int pos = i;
			
			for (int j = 0; j < N; j++) {
				pos = next[config[pos]];
				if (pos == -1)
					break;
			}
			
			if (pos != -1)
				return 1;
			
		}
		
		return 0;
		
	}
}