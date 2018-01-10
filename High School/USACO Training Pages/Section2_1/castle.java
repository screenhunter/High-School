/*
PROG: castle
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class castle {

	public static BufferedReader in;
	public static PrintWriter out;
	public static Module[][] castle;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("castle.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("castle.out")));

		String[] line = in.readLine().split(" ");
		castle = new Module[Integer.parseInt(line[1])][Integer
				.parseInt(line[0])];
		for (int i = 0; i < castle.length; i++) {

			line = in.readLine().split(" ");

			for (int j = 0; j < line.length; j++)
				castle[i][j] = new Module(Integer.parseInt(line[j]));

		}

		findAreas();
		findMax();

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void findMax() {

		int r = 0;
		int c = 0;
		String s = "";
		int area = 0;

		for (int j = 0; j < castle[0].length; j++)
			for (int i = castle.length - 1; i >= 0; i--) {

				if (i - 1 >= 0)
					if (castle[i][j].room != castle[i - 1][j].room)
						if (castle[i][j].area + castle[i - 1][j].area > area) {

							r = i + 1;
							c = j + 1;
							s = "N";
							area = castle[i][j].area + castle[i - 1][j].area;

						}

				if (j + 1 < castle[0].length)
					if (castle[i][j].room != castle[i][j + 1].room)
						if (castle[i][j].area + castle[i][j + 1].area > area) {

							r = i + 1;
							c = j + 1;
							s = "E";
							area = castle[i][j].area + castle[i][j + 1].area;

						}

			}

		out.println(area);
		out.println(r + " " + c + " " + s);

	}

	public static void findAreas() {

		int maxArea = 0;
		int roomCount = 0;

		ArrayList<Module> list = new ArrayList<Module>();
		for (int i = 0; i < castle.length; i++)
			for (int j = 0; j < castle[0].length; j++) {

				recur(i, j, roomCount, list);

				for (Module x : list)
					x.area = list.size();

				if (list.size() > 0)
					roomCount++;

				if (maxArea < list.size())
					maxArea = list.size();

				list.clear();

			}

		out.println(roomCount);
		out.println(maxArea);

	}

	public static void recur(int r, int c, int num, ArrayList<Module> list) {

		if (c >= castle[0].length || c < 0)
			return;
		if (r >= castle.length || r < 0)
			return;

		if (castle[r][c].visited == true)
			return;

		list.add(castle[r][c]);
		castle[r][c].visited = true;
		castle[r][c].room = num;

		if (!castle[r][c].walls[0])
			recur(r - 1, c, num, list);// move north

		if (!castle[r][c].walls[1])
			recur(r, c + 1, num, list);// move east

		if (!castle[r][c].walls[2])
			recur(r + 1, c, num, list);// move south

		if (!castle[r][c].walls[3])
			recur(r, c - 1, num, list);// move west

	}

}

class Module {

	// walls: north, east, south, west

	public boolean[] walls;
	public boolean visited;
	public int area, room;

	public Module(int x) {

		visited = false;
		area = 0;
		room = -1;
		walls = new boolean[4];
		if (x - 8 >= 0) {

			walls[2] = true;
			x -= 8;

		}
		if (x - 4 >= 0) {

			walls[1] = true;
			x -= 4;

		}
		if (x - 2 >= 0) {

			walls[0] = true;
			x -= 2;

		}
		if (x - 1 >= 0) {

			walls[3] = true;
			x -= 1;

		}

	}

}