import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class rblock {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static int[][] graph;
	public static HashMap<Integer, ArrayList<Integer>> connections;
	public static int[] prev;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("rblock.in"));
		out = new PrintWriter(new BufferedWriter(
				new FileWriter("rblock.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		graph = new int[N + 1][N + 1];
		connections = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < N; i++)
			connections.put(i + 1, new ArrayList<Integer>());

		for (int[] row : graph)
			Arrays.fill(row, Integer.MAX_VALUE);

		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			graph[a][b] = Integer.parseInt(line[2]);
			graph[b][a] = graph[a][b];
			connections.get(a).add(b);
			connections.get(b).add(a);

		}

		boolean[] visited = new boolean[N + 1];
		int dist = djik(N, visited);
		int max = dist;
		int[] check = Arrays.copyOf(prev, N+1);
		
		int cur = 1;
		while (cur != N) {

			graph[cur][check[cur]] *= 2;
			graph[check[cur]][cur] *= 2;
			
			Arrays.fill(visited, false);
			max = Math.max(djik(N, visited), max);
			
			graph[check[cur]][check[cur]] /= 2;
			graph[check[cur]][cur] /= 2;
			
			cur = check[cur];

		}

		out.println(max - dist);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	public static int djik(int start, boolean[] visited) {

		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		Node[] nodes = new Node[N + 1];
		prev = new int[N+1];

		graph[start][start] = 0;
		Arrays.fill(prev, start);

		for (int i = 1; i < visited.length; i++)
			if (visited[i])
				continue;
			else {

				nodes[i] = new Node(i, graph[i][start]);
				pq.add(nodes[i]);

			}

		while (pq.size() > 0) {

			Node cur = pq.poll();
			visited[cur.num] = true;
			if (cur.num == 1)
				break;

			for (int child : connections.get(cur.num))
				if (visited[child])
					continue;
				else {

					int alt = cur.dist + graph[cur.num][child];
					if (alt < nodes[child].dist) {

						pq.remove(nodes[child]);
						prev[child] = cur.num;
						nodes[child].dist = alt;
						pq.add(nodes[child]);

					}

				}

		}
		
		return nodes[1].dist;

	}

}

class Node implements Comparable<Node> {

	public int num, dist;

	public Node(int x, int y) {

		num = x;
		dist = y;

	}

	public int compareTo(Node n) {

		return this.dist - n.dist;

	}

	public String toString() {
		
		return "<" + num + " " + dist + ">";
		
	}
	
}