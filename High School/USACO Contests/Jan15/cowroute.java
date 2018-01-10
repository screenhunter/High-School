/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: cowroute
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class cowroute {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int A, B, N;
	public static int[][] cost, size;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("cowroute.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("cowroute.out")));

		String[] line = in.readLine().split(" ");
		A = Integer.parseInt(line[0]);
		B = Integer.parseInt(line[1]);
		N = Integer.parseInt(line[2]);
		cost = new int[1001][1001];
		size = new int[1001][1001];

		int c, m, x, y;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			c = Integer.parseInt(line[0]);
			m = Integer.parseInt(line[1]);
			line = in.readLine().split(" ");
			
			for (int j = 0; j < m - 1; j++)
				for (int k = j + 1; k < m; k++) {

					x = Integer.parseInt(line[j]);
					y = Integer.parseInt(line[k]);
					if (cost[x][y] == 0 || cost[x][y] > c) {

						cost[x][y] = c;
						size[x][y] = k - j;

					}

				}

		}
		
		djikstra();

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	private static void djikstra() {

		int[] dist = new int[N+1];
		int[] prev = new int[N+1];
		
		Arrays.fill(dist, -1);
		
		PriorityQueue<Port> pq = new PriorityQueue<Port>();
		//pq.add(new Port());
		
	}
	
	class Port implements Comparable<Port> {
		
		public int index, cost;
		
		public Port(int a, int b) {
			
			index = a;
			cost = b;
			
		}

		public int compareTo(Port o) {
			
			return cost - o.cost;
			
		}
		
	}

}
