import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

	public int[] previous;
	public Node[] nodes;
	public boolean[] visited;
	public int[][] distances;

	public Dijkstra(int N) {

		previous = new int[N + 1];
		nodes = new Node[N + 1];
		visited = new boolean[N + 1];
		distances = new int[N + 1][N + 1];

		for (int i = 0; i < N + 1; i++)
			Arrays.fill(distances[i], Integer.MAX_VALUE);

	}

	public void djik() {

		nodes[1].distance = 0;

		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		for (int i = 1; i < visited.length; i++)
			pq.add(nodes[i]);

		while (pq.size() > 0) {

			Node cur = pq.poll();
			System.out.println(cur.index);
			visited[cur.index] = true;

			for (Node child : cur.children)
				if (visited[child.index])
					continue;
				else {

					int alt = cur.distance + distances[cur.index][child.index];
					if (alt < child.distance) {
						
						pq.remove(child);
						child.distance = alt;
						previous[child.index] = cur.index;
						pq.add(child);

					}

				}

		}

	}

}

class Node implements Comparable<Node> {

	public int distance, index;
	public ArrayList<Node> children;

	public Node(int i) {

		index = i;
		distance = Integer.MAX_VALUE;
		children = new ArrayList<Node>();

	}

	public int compareTo(Node o) {

		return this.distance - o.distance;

	}

	public String toString() {

		return index + " " + distance;

	}

}