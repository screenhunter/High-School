/*
rkhanna
Rajat Khanna
02/06/2014
PROG: rblock
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class rblock {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static int[][] grid;
	public static Node[] nodes, prev;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("rblock.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("rblock.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		grid = new int[N + 1][N + 1];
		nodes = new Node[N + 1];

		for (int i = 0; i < N + 1; i++)
			Arrays.fill(grid[i], 1000000);

		for (int i = 0; i < N; i++)
			nodes[i + 1] = new Node(i + 1, 1000000);

		int a, b;
		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			grid[a][b] = Integer.parseInt(line[2]);
			grid[b][a] = grid[a][b];
			nodes[a].children.add(nodes[b]);
			nodes[b].children.add(nodes[a]);

		}

		djik();

		out.println(nodes[N].dist);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	public static void djik() {

		prev = new Node[N + 1];
		boolean[] visited = new boolean[N + 1];

		nodes[1].dist = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();

		for (int i = 0; i < N; i++)
			q.add(nodes[i + 1]);

		while (q.size() > 0) {
			
			for (int i = 0; i < N; i++)
				System.out
						.print(nodes[i + 1].dist + " " + visited[i + 1] + " ");

			Node v = q.poll();
			System.out.println(v.index + " " + v.dist);
			visited[v.index] = true;
			int dist;
			for (Node n : v.children) {

				if (visited[n.index])
					continue;

				dist = v.dist + grid[v.index][n.index];
				if (dist < n.dist) {

					n.dist = dist;
					prev[n.index] = v;

				}

			}

		}

	}

}

class Node implements Comparable<Node> {

	public int index, dist;
	public ArrayList<Node> children;

	public Node(int a, int b) {

		index = a;
		dist = b;
		children = new ArrayList<Node>();

	}

	public int compareTo(Node o) {

		return this.dist - o.dist;

	}

	public boolean equals(Node o) {

		return this.index == o.index;

	}

	public String toString() {

		return index + "";

	}

}