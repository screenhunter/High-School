
/*
prog: dream
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class dream {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static int[][] grid;
	public static boolean[][] visited;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("dream.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("dream.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		grid = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			for (int j = 0; j < M; j++)
				grid[i][j] = Integer.parseInt(line[j]);

		}

		out.println(bfs());

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	public static int bfs() {

		// 1 is up
		// 2 is right
		// 3 is down
		// 4 is left

		Queue<Tile> queue = new LinkedList<Tile>();

		Tile cur = new Tile(0, 0, false, 0, 0);
		queue.add(cur);

		int x, y, dir, length;
		boolean smell;
		while (queue.size() > 0) {

			cur = queue.poll();
			x = cur.x;
			y = cur.y;
			dir = cur.dir;
			length = cur.length;
			smell = cur.smell;

			if (x >= N || x < 0 || y >= M || y < 0)
				continue;

			if (grid[x][y] == 0)
				continue;

			if (grid[x][y] == 3 && !smell)
				continue;

			if (grid[x][y] != 4 && visited[x][y])
				continue;

			if (x == N - 1 && y == N - 1)
				return length;

			if (grid[x][y] == 4) {

				if (dir == 1)
					queue.add(new Tile(x, y - 1, false, 1, length + 1));
				else if (dir == 2)
					queue.add(new Tile(x + 1, y, false, 2, length + 1));
				else if (dir == 3)
					queue.add(new Tile(x, y + 1, false, 3, length + 1));
				else
					queue.add(new Tile(x - 1, y, false, 4, length + 1));

			} else {

				visited[x][y] = true;

				if (grid[x][y] == 2)
					smell = true;

				queue.add(new Tile(x, y - 1, smell, 1, length + 1));
				queue.add(new Tile(x + 1, y, smell, 2, length + 1));
				queue.add(new Tile(x, y + 1, smell, 3, length + 1));
				queue.add(new Tile(x - 1, y, smell, 4, length + 1));
				
			}

		}

		return -1;

	}

}

class Tile {

	int x, y, dir, length;
	boolean smell;

	public Tile(int a, int b, boolean s, int d, int l) {

		x = a;
		y = b;
		smell = s;
		dir = d;
		length = l;

	}
}