/*
PROG: holstein
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class holstein {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int V, G, sum;
	public static int[] min, total;
	public static boolean[] occupied, state;
	public static int[][] feed;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("holstein.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("holstein.out")));

		V = Integer.parseInt(in.readLine());
		min = new int[V];
		String[] line = in.readLine().split(" ");
		for (int i = 0; i < V; i++)
			min[i] = Integer.parseInt(line[i]);
		G = Integer.parseInt(in.readLine());
		feed = new int[G][V];
		total = new int[V];
		for (int i = 0; i < G; i++) {

			line = in.readLine().split(" ");
			for (int j = 0; j < V; j++) {

				feed[i][j] = Integer.parseInt(line[j]);
				total[j] += feed[i][j];

			}

		}

		sum = G;
		occupied = new boolean[G];
		state = new boolean[G];
		recur(sum, 0);
		
		out.print(sum);
		for (int i = 0; i < G; i++)
			if (!state[i])
				out.print(" " + (i + 1));
		out.println();
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void recur(int curSum, int index) {

		if (index >= G) {
			
			for (int i = 0; i < V; i++)
				if (min[i] > total[i])
					return;
			
			if (curSum == sum) {
				
				int cur = 0;
				while (cur < G && state[cur] == occupied[cur])
					cur++;
				if (cur < G && occupied[cur] == false) {
					
					sum = curSum;
					for (int i = 0; i < G; i++)
						state[i] = occupied[i];
					
				}
				
			} else if (curSum < sum) {
				
				sum = curSum;
				for (int i = 0; i < G; i++)
					state[i] = occupied[i];

			}

			return;

		}
		
		recur(curSum, index + 1);
		occupied[index] = true;
		for (int i = 0; i < V; i++)
			total[i] -= feed[index][i];
		recur(curSum-1, index + 1);
		occupied[index] = false;
		for (int i = 0; i < V; i++)
			total[i] += feed[index][i];
		
	}

}
