package Dec13;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;

public class wormhole2 {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, count;
	public static int[][] points;
	public static boolean[][] connected, check;
	public static int[] paired;
	public static HashSet<String> sets;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("wormhole.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("wormhole.out")));
		N = Integer.parseInt(in.readLine());
		points = new int[N][2];
		connected = new boolean[N][N];
		check = new boolean[N][N];
		paired = new int[N];
		Arrays.fill(paired, -1);
		count = 0;
		sets = new HashSet<String>();

		String[] line;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			points[i][0] = Integer.parseInt(line[0]);
			points[i][1] = Integer.parseInt(line[1]);

		}

		for (int i = 0; i < N; i++)
			findConnected(i);

		createPairs(0, "");
		out.println(count);

		in.close();
		out.close();
		System.exit(0);

	}

	private static void createPairs(int index, String s) {

		if (index >= N) {

			test(s);
			return;

		}

		if (paired[index] != -1)
			createPairs(index + 1, s + " " + paired[index]);
		else
			for (int i = 0; i < N; i++)
				if (paired[i] != -1 || i == index)
					continue;
				else {

					paired[i] = index;
					paired[index] = i;
					boolean a = connected[index][i];
					boolean b = connected[i][index];
					connected[index][i] = true;
					connected[i][index] = true;
					createPairs(index + 1, s + " " + i);
					paired[i] = -1;
					paired[index] = -1;
					connected[index][i] = a;
					connected[i][index] = b;

				}

	}

	public static void test(String s) {
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (connected[i][j])
					check[i][j] = true;

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				for (int k = 0; k < N; k++)
					if (check[i][k] && check[k][j])
						check[i][j] = true;

		for (int i = 0; i < N; i++)
			if (check[i][i]) {
				
				int before = sets.size();
				sets.add(s);
				if (before < sets.size())
				count++;
				System.out.println(s);
				break;

			}

	}

	private static void findConnected(int x) {

		big: for (int i = 0; i < N; i++)
			if (points[x][1] == points[i][1] && points[x][0] < points[i][0]) {

				for (int j = 0; j < i; j++)
					if (connected[x][j] && points[j][0] < points[i][0]
							&& j != x)
						continue big;

				connected[x][i] = true;

			}

	}

}
