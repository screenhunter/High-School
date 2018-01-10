import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Blizzard {

	public static int n;
	public static long[][] coor;
	public static TreeSet<Long> dist;
	public static boolean[][] connected;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		coor = new long[2][n];
		connected = new boolean[n][n];
		for (int j = 0; j < 2; j++) {

			String[] line = in.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				coor[j][i] = Long.parseLong(line[i]);
				connected[i][i] = true;

			}

		}

		dist = new TreeSet<Long>();
		find_Distances();
		System.out.println(compute());

		in.close();

	}

	private static void find_Distances() {

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				dist.add((coor[0][i] - coor[0][j])*(coor[0][i] - coor[0][j])
						+ (coor[1][i] - coor[1][j])*(coor[1][i] - coor[1][j]));

	}

	private static double compute() {

		for (long r : dist) {

			for (int i = 0; i < n; i++)
				for (int j = i + 1; j < n; j++)
					if ((coor[0][i] - coor[0][j])*(coor[0][i] - coor[0][j])
							+ (coor[1][i] - coor[1][j])*(coor[1][i] - coor[1][j]) <= r) {

						connected[i][j] = true;
						connected[j][i] = true;

					}
			
			if (check())
				return Math.sqrt(r);

		}

		return 0.0;

	}

	private static boolean check() {
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					if (connected[i][k] && connected[j][k]) {
						
						connected[i][j] = true;
						connected[j][i] = true;
						
					}
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
			if (!connected[i][0])
				return false;
		
		return true;
	}

}