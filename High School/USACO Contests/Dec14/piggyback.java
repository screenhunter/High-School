/*
rkhanna 
Rajat Khanna
12/13/2014
prog: piggyback
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class piggyback {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int B, E, P, N, M;
	public static HashMap<Integer, ArrayList<Integer>> connections;
	public static int[] bessie, elsie, together;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("piggyback.in"));
		out = new PrintWriter(new BufferedWriter(
				new FileWriter("piggyback.out")));

		String[] line = in.readLine().split(" ");
		B = Integer.parseInt(line[0]);
		E = Integer.parseInt(line[1]);
		P = Integer.parseInt(line[2]);
		N = Integer.parseInt(line[3]);
		M = Integer.parseInt(line[4]);
		connections = new HashMap<Integer, ArrayList<Integer>>();
		bessie = new int[N + 1];
		elsie = new int[N + 1];
		together = new int[N + 1];

		Arrays.fill(bessie, -1);
		Arrays.fill(elsie, -1);
		Arrays.fill(together, -1);

		for (int i = 1; i <= N; i++)
			connections.put(i, new ArrayList<Integer>());

		int x, y;
		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			x = Integer.parseInt(line[0]);
			y = Integer.parseInt(line[1]);
			connections.get(x).add(y);
			connections.get(y).add(x);

		}

		bfs(1, bessie);
		bfs(2, elsie);
		bfs(N, together);

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= N; i++)
			if (bessie[i] * B + elsie[i] * E + together[i] * P < min)
				min = bessie[i] * B + elsie[i] * E + together[i] * P;

		out.println(min);

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	private static void bfs(int start, int[] distances) {

		Queue<Integer> list = new LinkedList<Integer>();
		list.add(start);
		distances[start] = 0;

		while (list.size() > 0) {

			int cur = list.poll();

			for (int next : connections.get(cur))
				if (distances[next] == -1) {

					distances[next] = distances[cur] + 1;
					list.add(next);

				}

		}

	}

}
