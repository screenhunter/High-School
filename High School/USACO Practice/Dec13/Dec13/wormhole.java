package Dec13;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class wormhole {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static ArrayList<Vertex> points;
	public static boolean[] paired;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("wormhole.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("wormhole.out")));
		N = Integer.parseInt(in.readLine());
		points = new ArrayList<Vertex>();
		paired = new boolean[N];
		
		for (int i = 0; i < N; i++)
			points.add(new Vertex(in.readLine().split(" ")));
		createGraph();
		createPairs(0);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void createPairs(int index) {

		if (index >= N) {
			
			return;
			
		}
		
		for (int i = 0; i < N; i++)
			if (paired[i] || i == index)
				continue;
			else {
				
				paired[i] = true;
				paired[index] = true;
				points.get(index).children.add(points.get(i));
				createPairs(index + 1);
				
			}
		
	}

	private static void createGraph() {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (points.get(i).y == points.get(j).y
						&& points.get(i).x < points.get(j).x)
					if (points.get(i).children.size() == 0)
						points.get(i).children.add(points.get(j));
					else if (points.get(i).children.get(0).x > points.get(j).x) {

						points.get(i).children.remove(0);
						points.get(i).children.add(points.get(j));

					}

	}

}

class Vertex {

	public ArrayList<Vertex> children;
	public int x, y;

	public Vertex(String[] line) {

		x = Integer.parseInt(line[0]);
		y = Integer.parseInt(line[1]);
		children = new ArrayList<Vertex>();

	}

}